package ua.skillsup.dao;

import ua.skillsup.domain.model.Person;

import java.util.List;

public interface PersonDao {

    List<Person> findAll();
    Person save(Person person);
    Person delete(Person person);
    Person update(Person person);
}
