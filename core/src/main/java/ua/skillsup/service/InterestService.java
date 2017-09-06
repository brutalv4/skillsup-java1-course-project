package ua.skillsup.service;

import ua.skillsup.domain.model.Hobby;
import ua.skillsup.domain.model.Person;
import ua.skillsup.domain.model.Place;

import java.util.List;

public interface InterestService {

    Place addPlace(Place place);
    Hobby addHobby(Hobby hobby);
    List<Person> getAllPeopleWithHobby(Hobby hobby);
    List<Person> getAllPeopleFromPlace(Place place);
}
