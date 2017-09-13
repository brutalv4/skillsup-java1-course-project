package ua.skillsup.dao;

import ua.skillsup.domain.model.Person;

import java.util.List;

public interface PersonDao {

    List<Person> findAll();
    int count();
    Person save(Person person);
    Person delete(Person person);
}
