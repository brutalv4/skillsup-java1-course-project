package ua.skillsup.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.skillsup.dao.PersonDao;
import ua.skillsup.dao.entity.PersonEntity;
import ua.skillsup.domain.model.Person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static ua.skillsup.dao.converters.EntityDtoConverter.convert;

@Repository
public class PersonDaoImpl implements PersonDao {
    private final SessionFactory sessionFactory;
    private int count;

    @Autowired
    public PersonDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private void init() {

    }

    @Override
    @Transactional
    public Person save(Person person) {
        Session session = sessionFactory.getCurrentSession();
        PersonEntity entity = convert(person);
        Serializable id = session.save(entity);

        person.setId((Long) id);
        count++;

        return person;
    }

    @Transactional
    public Person update(Person dto) {

        return null;
    }

    @Transactional
    public Person delete(Person person) {
        Session session = sessionFactory.getCurrentSession();
        PersonEntity entity = find(person);
        session.delete(entity);
        person.setId(0);
        count--;
        return person;
    }


    /**
     * Searches corresponding person entity in database via the highest possible
     * criteria built for given person DTO.
     * @param person
     * @return
     */
    private PersonEntity find(Person person) {
        PersonEntity result;

        if (person.getId() == 0) {
            Session currentSession = sessionFactory.getCurrentSession();
            Criteria criteria = currentSession.createCriteria(PersonEntity.class);

            Optional.ofNullable(person.getFirstName())
                    .ifPresent(value -> criteria.add(Restrictions.eq("firstName", value)));

            Optional.ofNullable(person.getLastName())
                    .ifPresent(value -> criteria.add(Restrictions.eq("lastName", value)));

            Optional.ofNullable(person.getBirthDate())
                    .ifPresent(value -> criteria.add(Restrictions.eq("birthDate", value)));

            Optional.ofNullable(person.getNickname())
                    .ifPresent(value -> criteria.add(Restrictions.eq("nickname", value)));

            result = (PersonEntity) criteria.uniqueResult();
        } else {
            result = (PersonEntity) sessionFactory.getCurrentSession().get(PersonEntity.class, person.getId());
        }

        return result;
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

    public int count() {
        return count;
    }
}
