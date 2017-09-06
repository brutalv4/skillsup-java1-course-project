package ua.skillsup.dao;

import org.springframework.stereotype.Repository;
import ua.skillsup.domain.model.Person;

import java.util.List;

public interface PersonDao {

    List<Person> findAll();

}
