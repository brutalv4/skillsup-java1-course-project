package ua.skillsup;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.skillsup.dao.PersonDao;
import ua.skillsup.domain.HasId;
import ua.skillsup.domain.model.Person;
import ua.skillsup.service.MainService;

import java.util.List;

public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("core-spring-config.xml");


        MainService mainService = context.getBean("mainService", MainService.class);

        PersonDao personDao = context.getBean("personDao", PersonDao.class);
        Person second = personDao.findById(2);

        System.out.println(second);
    }
}
