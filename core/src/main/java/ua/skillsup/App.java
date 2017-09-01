package ua.skillsup;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.skillsup.dao.PersonDao;
import ua.skillsup.domain.HasId;
import ua.skillsup.domain.model.Person;
import ua.skillsup.service.MainService;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("core-spring-config.xml");


        MainService mainService = context.getBean("mainService", MainService.class);

        PersonDao personDao = context.getBean("personDao", PersonDao.class);
//        Person second = personDao.findById(2);
        Person person = new Person("Dmitry", "Kovalevsky");
        person.setBirthDate(LocalDate.of(1985, Month.APRIL, 30));
        person.setNickname("Diamond");

        personDao.save(person);
        personDao.findById(3);
        System.out.println();

    }
}
