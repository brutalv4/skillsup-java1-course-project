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

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:test-dao-spring-config.xml")
public class PersonDaoImplTest {

    @Autowired
    private PersonDao dao;

    @Test
    public void testSave_checkCountAfter() {
        int sizeBefore = dao.count();
        Person person = new Person("John", "Doe");
        dao.save(person);

        assertThat("Count didn't change after save! ",
                dao.count(), greaterThan(sizeBefore));
    }

    @Test
    public void testSave_checkPersonIdAfter() {
        Person person = new Person("John", "Doe");
        dao.save(person);

        assertThat("Person Id didn't set after save!",
                Long.valueOf(person.getId()), greaterThan(Long.valueOf(0)));
    }

    @Test
    @Ignore
    public void update() throws Exception {
    }

    @Test
    public void testDelete_checkCountAfter() throws Exception {
        Person person = new Person("John", "Doe");
        dao.save(person);
        int countBefore = dao.count();
        dao.delete(person);

        assertThat("Count didn't change after delete!",
                dao.count(), lessThan(countBefore));
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