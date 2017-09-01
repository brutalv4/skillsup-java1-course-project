package ua.skillsup.dao.impl;

import java.util.List;

public abstract class GenericDaoImpl<E> implements ua.skillsup.dao.GenericDao<E> {

    @Override
    public E save(E dto) {
        return null;
    }

    @Override
    public E update(E dto) {

        return null;
    }

    @Override
    public E delete(E dto) {

        return null;
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
