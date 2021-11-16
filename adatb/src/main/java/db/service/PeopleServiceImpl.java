package db.service;

import db.repository.PeopleModle;
import db.repository.PeopleRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class PeopleServiceImpl implements PeopleService {
    private final PeopleRepository peopleRepository;

    public PeopleServiceImpl(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Override
    public Iterable<People> getAllPeople() {

        return StreamSupport.stream(peopleRepository.findAll().spliterator(), false)
                .map(People::new)
                .collect(Collectors.toList());

    }

    @Override
    public People create(People people) {
        return new People(peopleRepository.save(people.toEntity()));
    }

    @Override
    public void delete(Long id){
        try{
            peopleRepository.deleteById(id);
        }catch (EmptyResultDataAccessException ex){
            throw new NoSuchEntityExceotion(id);
        }
    }

    @Override
    public People getById(Long id){
        Optional<db.repository.PeopleModle>optionalPeople=peopleRepository.findById(id);
        if (optionalPeople.isEmpty()){
            throw new NoSuchEntityExceotion(id);
        }
        return new People(optionalPeople.get());
    }

    @Override
    public void save(People people) {
        Optional<db.repository.PeopleModle>optionalPeople=peopleRepository.findById(people.getId());
        if (optionalPeople.isEmpty()) {
            throw new NoSuchEntityExceotion(people.getId());
        }
        peopleRepository.save(people.toEntity());
    }

    @Override
    public Iterable findByIdAgeGreather(int age) {
        return null;
    }
}
