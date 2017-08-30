package ua.skillsup;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.skillsup.dao.PersonDao;
import ua.skillsup.domain.HasId;
import ua.skillsup.service.MainService;

public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("core-spring-config.xml");


        MainService mainService = context.getBean("mainService", MainService.class);

        PersonDao personDao = context.getBean("personDao", PersonDao.class);
        personDao.findAll();

        System.out.println();
    }
}
