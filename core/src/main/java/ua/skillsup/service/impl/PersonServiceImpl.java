package ua.skillsup.service.impl;

import ua.skillsup.dao.PersonDao;
import ua.skillsup.domain.model.Person;
import ua.skillsup.service.PersonService;

public class PersonServiceImpl extends GenericService implements PersonService {

    private PersonDao dao;

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


    public PersonServiceImpl() {
    }

    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }
}
