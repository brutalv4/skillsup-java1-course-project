package ua.skillsup.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.skillsup.dao.PlaceDao;

@Repository
public class PlaceDaoImpl implements PlaceDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public PlaceDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
