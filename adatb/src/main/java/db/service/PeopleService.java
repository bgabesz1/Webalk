package db.service;


import db.repository.PeopleModle;

public interface PeopleService {
    Iterable<PeopleModle> getAllPeople();
    PeopleModle create(PeopleModle people);


    void delete(Long id);
    PeopleModle getById(Long id);
    void save(PeopleModle people);

    PeopleModle[] findByAgeGreaterThan(int age);
}
