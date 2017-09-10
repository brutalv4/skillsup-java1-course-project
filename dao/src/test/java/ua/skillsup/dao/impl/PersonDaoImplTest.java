package ua.skillsup.dao.impl;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ua.skillsup.dao.PersonDao;
import ua.skillsup.domain.model.Person;

import javax.transaction.Transactional;

import static org.junit.Assert.assertNotEquals;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-dao-spring-config.xml")
public class PersonDaoImplTest {

    @Autowired
    private PersonDao dao;

    @Test
    public void testSave_checkRecordsCountAfter() throws Exception {
        int sizeBefore = dao.findAll().size();
        dao.save(new Person("John", "Doe"));
        assertNotEquals(sizeBefore, dao.findAll().size());

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