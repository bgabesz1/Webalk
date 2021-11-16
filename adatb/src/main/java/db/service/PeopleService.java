package db.service;


import db.repository.PeopleModle;

public interface PeopleService {
    Iterable<People> getAllPeople();
    People create(People people);

    void delete(Long id);

    People getById(Long id) throws NoSuchEntityExceotion;

    void save(People people);

    Iterable findByIdAgeGreather(int age);
}
