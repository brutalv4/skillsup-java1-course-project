package ua.skillsup.dao;

import ua.skillsup.domain.model.Person;

import java.util.List;

public interface PersonDao extends Dao {

    List<Person> findAll();
}
