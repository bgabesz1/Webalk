package db.service;

import db.repository.PeopleModle;

public class People {

    Long id;

    private int age;

    private String name;


    public People() {
    }
    public People(PeopleModle people) {
        this.age = people.getAge();
        this.name = people.getName();
        this.id = people.getId();

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PeopleModle toEntity(){
        return new PeopleModle(id, age, name);
    }
}

