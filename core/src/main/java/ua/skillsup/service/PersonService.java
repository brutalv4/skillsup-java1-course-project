package ua.skillsup.service;

import ua.skillsup.domain.model.Person;

public interface PersonService extends Service {

    Person createPerson();
    boolean removePerson();
    boolean addFriendship(Person friend);

}
