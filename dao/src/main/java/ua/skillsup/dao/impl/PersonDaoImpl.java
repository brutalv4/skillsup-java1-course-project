package ua.skillsup.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.skillsup.dao.PersonDao;
import ua.skillsup.dao.converters.EntityDtoConverter;
import ua.skillsup.dao.entity.PersonEntity;
import ua.skillsup.domain.model.Person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonDaoImpl extends GenericDaoImpl<Person> implements PersonDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public PersonDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private void init() {

    }

    @Override
    public Person save(Person dto) {
        Session session = sessionFactory.getCurrentSession();
        PersonEntity entity = EntityDtoConverter.convert(dto);
        Serializable id = session.save(entity);

        dto.setId((Long) id);

        return dto;
    }

    @Override
    public Person update(Person dto) {

        return null;
    }

    @Override
    public Person delete(Person dto) {
        Session session = sessionFactory.getCurrentSession();
        PersonEntity entity = EntityDtoConverter.convert(dto);
        session.delete(entity);
        dto.setId(0);

        return dto;
    }

    @Override
    public Person findById(long id) {
        Session session = sessionFactory.getCurrentSession();
        Object result = session.get(PersonEntity.class, id);

        return EntityDtoConverter.convert((PersonEntity) result);
    }

    @Override
    public List<Person> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List<PersonEntity> people =
                session
                        .createQuery("from ua.skillsup.dao.entity.PersonEntity")
                        .list();
        List<Person> result = new ArrayList<>(people.size());

        for (PersonEntity personEntity : people) {
            Person person = EntityDtoConverter.convert(personEntity);
            result.add(person);
        }

        return result;
    }
}
