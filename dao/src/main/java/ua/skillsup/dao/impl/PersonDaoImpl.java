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

    /**
     *
     * @param person
     * @return
     */
    @Override
    @Transactional
    public Person save(Person person) {
        Session session = sessionFactory.getCurrentSession();
        PersonEntity entity = convert(person);
        Serializable id = session.save(entity);

        person.setId((Long) id);

        return person;
    }

    /**
     *
     * @param person
     * @return
     */
    @Override
    @Transactional
    public Person update(Person person) {
        PersonEntity entity = null;
        sessionFactory.getCurrentSession().save(entity);

        return null;
    }

    /**
     *
     * @param person
     * @return
     */
    @Transactional
    public Person delete(Person person) {
        person.setId(0);
        return person;
    }

    /**
     *
     * @param id
     * @return
     */
    @Transactional(readOnly = true)
    public Person findById(long id) {
        return convert((PersonEntity) sessionFactory.getCurrentSession().get(PersonEntity.class, id));
    }

    /**
     *
     * @return
     */
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
