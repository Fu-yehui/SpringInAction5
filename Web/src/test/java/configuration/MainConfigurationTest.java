package configuration;

import entity.Employee;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={MainConfigurationTest.class})
@ActiveProfiles("dev")
class MainConfigurationTest {

    @Test
    void employee() {
        AnnotationConfigApplicationContext annoContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Employee employee = annoContext.getBean(Employee.class);
        System.out.println(employee);
    }
}