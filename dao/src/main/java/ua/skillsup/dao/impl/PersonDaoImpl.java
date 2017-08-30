package ua.skillsup.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ua.skillsup.dao.PersonDao;
import ua.skillsup.dao.converters.EntityDtoConverter;
import ua.skillsup.dao.entity.PersonEntity;
import ua.skillsup.domain.model.Person;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class PersonDaoImpl extends GenericDaoImpl<Person> implements PersonDao {

    private SessionFactory sessionFactory;

    public PersonDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private void init() {

    }

    @Override
    public Person save(Person dto) {
        Session session = sessionFactory.getCurrentSession();
        session.save(EntityDtoConverter.convert(dto));

        return null;
    }

    @Override
    public boolean update(Person dto) {

        return false;
    }

    @Override
    public boolean delete(Person dto) {

        return false;
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
            result.add(EntityDtoConverter.convert(personEntity));
        }

        return result;
    }
}
