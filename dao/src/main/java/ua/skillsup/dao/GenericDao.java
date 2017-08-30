package ua.skillsup.dao;

import java.util.List;

public interface GenericDao<E> {

    E save(E dto);
    boolean update(E dto);
    boolean delete(E dto);
    E findById(long id);
    List<E> findAll();
}
