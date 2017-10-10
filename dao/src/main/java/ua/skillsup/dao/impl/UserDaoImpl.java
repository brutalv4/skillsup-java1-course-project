package ua.skillsup.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.skillsup.dao.AbstractDAO;
import ua.skillsup.dao.UserDao;
import ua.skillsup.dao.entity.UserEntity;

@Repository
public class UserDaoImpl extends AbstractDAO<UserEntity> implements UserDao {

    @Autowired
    public UserDaoImpl(SessionFactory sessionFactory) {
        super(UserEntity.class, sessionFactory);
    }

}
