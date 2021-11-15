package db.Controller;

import db.repository.PeopleModle;

public class PeopleDto {
    private long id;
    private String name;
    private int age;

    public PeopleDto() {
    }

    public PeopleDto(PeopleModle people) {
        this.id = people.getId();
        this.name = people.getName();
        this.age = people.getAge();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PeopleModle toPeople(){
        return new PeopleModle(id, age, name);
    }
}
