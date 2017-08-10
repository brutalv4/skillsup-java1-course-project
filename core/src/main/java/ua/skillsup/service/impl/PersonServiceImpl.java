package ua.skillsup.service.impl;

import ua.skillsup.dao.PersonDao;
import ua.skillsup.domain.model.Person;
import ua.skillsup.service.PersonService;

public class PersonServiceImpl extends GenericService implements PersonService {

    private final PersonDao DAO;

    public PersonServiceImpl(PersonDao dao) {
        this.DAO = dao;
    }

    private void init() {

    }

    @Override
    public Person createPerson() {
        return null;
    }

    @Override
    public boolean removePerson() {
        return false;
    }

    @Override
    public boolean addFriendship(Person friend) {
        return false;
    }
}
