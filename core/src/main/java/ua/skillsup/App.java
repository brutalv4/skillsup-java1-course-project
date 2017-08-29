package ua.skillsup;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import ua.skillsup.service.MainService;

public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("core-spring-config.xml");


        MainService mainService = context.getBean("mainService", MainService.class);

        Object personDao = context.getBean("personDao");
        System.out.println();
    }
}
