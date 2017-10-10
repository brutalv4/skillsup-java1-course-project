package ua.skillsup.dao;

import org.hibernate.SessionFactory;

public abstract class AbstractDAO<T> {
    private final SessionFactory sessionFactory;
    private final Class persistentClass;

    public AbstractDAO(Class persistentClass, SessionFactory sessionFactory) {
        this.persistentClass = persistentClass;
        this.sessionFactory = sessionFactory;

    }

}
