package ua.skillsup.dao;

import java.util.List;

public interface GenericDao<E> {

    E save(E dto);
    E update(E dto);
    E delete(E dto);
    E findById(long id);
    List<E> findAll();
}
