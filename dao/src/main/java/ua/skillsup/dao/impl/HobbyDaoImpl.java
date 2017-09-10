package ua.skillsup.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.skillsup.dao.HobbyDao;

@Repository
public class HobbyDaoImpl implements HobbyDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public HobbyDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
