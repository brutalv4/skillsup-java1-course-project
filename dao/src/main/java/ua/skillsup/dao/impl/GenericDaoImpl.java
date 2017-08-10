package ua.skillsup.dao.impl;

import ua.skillsup.domain.HasId;

import java.util.List;

public abstract class GenericDaoImpl<E extends HasId> implements ua.skillsup.dao.GenericDao {

    @Override
    public Object save(Object entity) {
        return null;
    }

    @Override
    public void update(Object entity) {

    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public Object findById(long id) {
        return null;
    }

    @Override
    public List findAll() {
        return null;
    }
}
