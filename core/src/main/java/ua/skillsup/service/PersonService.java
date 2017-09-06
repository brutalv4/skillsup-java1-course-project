package ua.skillsup.service;

import ua.skillsup.domain.model.Person;

public interface PersonService {

    Person createPerson();
    boolean removePerson();
    boolean addFriendship(Person friend);

}
