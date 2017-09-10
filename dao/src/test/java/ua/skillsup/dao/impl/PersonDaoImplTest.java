package ua.skillsup.dao.impl;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ua.skillsup.dao.PersonDao;

import javax.transaction.Transactional;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-dao-spring-config.xml")
public class PersonDaoImplTest {

    @Autowired
    private PersonDao dao;

    @Test
    public void testSave() throws Exception {

    }

    @Test
    @Ignore
    public void update() throws Exception {
    }

    @Test
    @Ignore
    public void delete() throws Exception {
    }

    @Test
    @Ignore
    public void findById() throws Exception {
    }

    @Test
    @Ignore
    public void findAll() throws Exception {
    }
}