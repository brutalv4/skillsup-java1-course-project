package ua.skillsup.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ua.skillsup.dao.PersonDao;

public class PersonDaoImpl extends GenericDaoImpl implements PersonDao {

    @Autowired
    private SessionFactory factory;

    private void init() {
        System.out.println("PersonDaoImpl init()");

        System.out.println(factory);
    }

}
