package ua.skillsup.dao;

import ua.skillsup.domain.model.Person;

import java.util.List;

public interface PersonDao {

    List<Person> findAll();
    Person save(Person dto);
}
