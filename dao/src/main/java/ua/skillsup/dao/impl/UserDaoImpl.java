package ua.skillsup.dao.impl;

import ua.skillsup.dao.AbstractDAO;
import ua.skillsup.dao.UserDao;
import ua.skillsup.dao.entity.UserEntity;

public class UserDaoImpl extends AbstractDAO<UserEntity> implements UserDao {

    public UserDaoImpl() {
        super(UserEntity.class);
    }

}
