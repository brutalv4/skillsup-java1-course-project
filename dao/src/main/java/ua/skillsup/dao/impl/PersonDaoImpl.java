package ua.skillsup.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import ua.skillsup.dao.PersonDao;
import ua.skillsup.domain.model.Person;

import javax.transaction.Transactional;
import java.util.Iterator;
import java.util.List;

@Repository
@Transactional
public class PersonDaoImpl extends GenericDaoImpl<Person> implements PersonDao {

    private SessionFactory sessionFactory;

    public PersonDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private void init() {
        System.out.println("PersonDaoImpl init()");
    }

    @Override
    public Person save(Person entity) {
        return null;
    }

    @Override
    public void update(Person entity) {

    }

    @Override
    public void delete(Person entity) {

    }

    @Override
    public List<Person> findAll() {
        Session currentSession = sessionFactory.getCurrentSession();
//        Query query = currentSession.createQuery("from Person");
//        Iterator iterator = query.iterate();
//
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println(next);
//        }

        return null;
    }
}
