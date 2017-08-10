package ua.skillsup.dao.impl;

import ua.skillsup.dao.PersonDao;
import ua.skillsup.domain.model.Person;

import java.util.List;

public class PersonDaoImpl extends GenericDao implements PersonDao {

    @Override
    public List<Person> findAll() {
        return null;
    }

    private void init() {
        System.out.println("PersonDaoImpl init");
    }
}
