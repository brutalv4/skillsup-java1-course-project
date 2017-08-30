package ua.skillsup.dao.impl;

import java.util.List;

public abstract class GenericDaoImpl<E> implements ua.skillsup.dao.GenericDao<E> {

    @Override
    public E save(E dto) {
        return null;
    }

    @Override
    public boolean update(E dto) {

        return false;
    }

    @Override
    public boolean delete(E dto) {

        return false;
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
