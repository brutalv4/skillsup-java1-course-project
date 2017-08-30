package ua.skillsup.dao.converters;

import ua.skillsup.dao.entity.PersonEntity;
import ua.skillsup.domain.model.Person;

public final class EntityDtoConverter {

    private EntityDtoConverter() {
        //private default constructor for utility class
    }

    public static Person convert(PersonEntity entity) {
        Person result = null;

        if (entity != null) {
            result = new Person();
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
        PersonEntity result = null;

        if (person != null) {
            result = new PersonEntity();
            result.setFirstName(person.getFirstName());
            result.setLastName();
        }

        return null;
    }
}
