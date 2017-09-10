package ua.skillsup.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.skillsup.dao.PersonDao;
import ua.skillsup.dao.entity.PersonEntity;
import ua.skillsup.domain.model.Person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static ua.skillsup.dao.converters.EntityDtoConverter.convert;

@Repository
public class PersonDaoImpl implements PersonDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public PersonDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private void init() {

    }

    @Override
    @Transactional
    public Person save(Person dto) {
        Session session = sessionFactory.getCurrentSession();
        PersonEntity entity = convert(dto);
        Serializable id = session.save(entity);

        dto.setId((Long) id);

        return dto;
    }

    @Transactional
    public Person update(Person dto) {

        return null;
    }

    @Transactional
    public Person delete(Person dto) {
        Session session = sessionFactory.getCurrentSession();
        PersonEntity entity = convert(dto);
        session.delete(entity);
        dto.setId(0);

        return dto;
    }

    @Transactional(readOnly = true)
    public Person findById(long id) {
        Session session = sessionFactory.getCurrentSession();
        Object result = session.get(PersonEntity.class, id);

        return convert((PersonEntity) result);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Person> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List<PersonEntity> people =
                session
                        .createQuery("from ua.skillsup.dao.entity.PersonEntity")
                        .list();
        List<Person> result = new ArrayList<>(people.size());

        for (PersonEntity personEntity : people) {
            Person person = convert(personEntity);
            result.add(person);
        }

        return result;
    }
}
