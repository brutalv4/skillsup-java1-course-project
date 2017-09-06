package ua.skillsup.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.skillsup.dao.PersonDao;
import ua.skillsup.domain.model.Person;
import ua.skillsup.service.PersonService;

@Service
public class PersonServiceImpl extends GenericService implements PersonService {

    private final PersonDao dao;

    @Autowired
    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
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
