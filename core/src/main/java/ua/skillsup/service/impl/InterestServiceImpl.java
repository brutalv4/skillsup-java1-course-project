package ua.skillsup.service.impl;

import ua.skillsup.dao.HobbyDao;
import ua.skillsup.dao.PlaceDao;
import ua.skillsup.domain.model.Hobby;
import ua.skillsup.domain.model.Person;
import ua.skillsup.domain.model.Place;
import ua.skillsup.service.InterestService;

import java.util.List;

public class InterestServiceImpl extends GenericService implements InterestService {
    private final PlaceDao placeDao;
    private final HobbyDao hobbyDao;

    public InterestServiceImpl(PlaceDao placeDao, HobbyDao hobbyDao) {
        this.placeDao = placeDao;
        this.hobbyDao = hobbyDao;
    }

    private void init() {

    }

    @Override
    public Place addPlace(Place place) {
        return null;
    }

    @Override
    public Hobby addHobby(Hobby hobby) {
        return null;
    }

    @Override
    public List<Person> getAllPeopleWithHobby(Hobby hobby) {
        return null;
    }

    @Override
    public List<Person> getAllPeopleFromPlace(Place place) {
        return null;
    }
}
