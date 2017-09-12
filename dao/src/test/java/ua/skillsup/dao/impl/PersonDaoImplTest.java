package ua.skillsup.dao.impl;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ua.skillsup.dao.PersonDao;
import ua.skillsup.domain.model.Person;

import javax.transaction.Transactional;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-dao-spring-config.xml")
public class PersonDaoImplTest {

    @Autowired
    private PersonDao dao;
    private Person person;

    @Before
    public void prepare() {
        person = new Person("John", "Doe");
    }

    @Test
    public void testSave_checkRecordsCountAfter() {
        int sizeBefore = dao.findAll().size();
        dao.save(person);

        assertThat(dao.findAll().size(), greaterThan(sizeBefore));
    }

    @Test
    public void testSave_checkPersonIdAfter() {
        dao.save(person);

        assertThat((Long) person.getId(), greaterThan(0));
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