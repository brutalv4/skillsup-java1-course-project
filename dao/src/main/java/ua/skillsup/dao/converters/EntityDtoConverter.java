package ua.skillsup.dao.converters;

import ua.skillsup.dao.entity.PersonEntity;
import ua.skillsup.domain.model.Person;

import java.sql.Date;

public final class EntityDtoConverter {

    private EntityDtoConverter() {
        //private default constructor for utility class
    }

    public static Person convert(PersonEntity entity) {
        Person result = new Person();

        if (entity != null) {
            result.setId(entity.getId());
            result.setFirstName(entity.getFirstName());
            result.setLastName(entity.getLastName());
            result.setBirthDate(
                    entity.getBirthDate().toLocalDate()
            );
            result.setNickname(entity.getNickname());
        }

        return result;
    }

    public static PersonEntity convert(Person person) {
        PersonEntity result = new PersonEntity();

        if (person != null) {
            result.setFirstName(person.getFirstName());
            result.setLastName(person.getLastName());
            result.setBirthDate(Date.valueOf(person.getBirthDate()));
            result.setNickname(person.getNickname());
        }

        return result;
    }
}
