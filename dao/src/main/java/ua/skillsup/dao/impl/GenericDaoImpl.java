package ua.skillsup.dao.impl;

import java.util.List;

public abstract class GenericDaoImpl<E> implements ua.skillsup.dao.GenericDao<E> {

    @Override
    public E save(E entity) {
        return null;
    }

    @Override
    public void update(E entity) {

    }

    @Override
    public void delete(E entity) {

    }

    @Override
    public E findById(long id) {
        return null;
    }

    @Override
    public List<E> findAll() {
        return null;
    }
}
