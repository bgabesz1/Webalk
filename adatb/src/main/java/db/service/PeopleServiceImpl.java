package db.service;

import db.repository.PeopleModle;
import db.repository.PeopleRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PeopleServiceImpl implements PeopleService {
    private final PeopleRepository peopleRepository;


    public PeopleServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public Iterable<People> getAllPeople() {
        List<People> rv = new ArrayList<>();
        for (PeopleModle people: peopleRepository.findAll()){
            rv.add(new People(People));
        }
        return rv;
    }
    @Override
    public People create(People people) {
        return new People(peopleRepository.save(people.toEntity()));
    }

    @Override
    public void delete(Long id){
        try {
            PeopleRepository.deleteById(id);
        }catch (EmptyResultDataAccessException ex){
            throw new NoSuchEntityExceotion(id);
        }
    }
     @Override
    public People getById(Long id){
        Optional<PeopleModle> optionalPeople = peopleRepository.findById(id);
        if(optionalPeople.isEmpty()){
            throw new NoSuchEntityExceotion(id);
        }
        return new People(optionalPeople.get());
     }
     @Override
    public void save(People people){
        Optional<PeopleModle> optionalPeople = peopleRepository.findById(people.getId());
        if(optionalPeople.isEmpty()){
            throw new NoSuchEntityExceotion(people.getId());
        }
        peopleRepository.save(people.toEntity());
     }

}
