
import configuration.MainConfiguration;
import configuration.ProfileConfiguration;
import configuration.TestScan;
import entity.Employee;
import entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//            ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
//            TestScan testScan = context.getBean(TestScan.class);
//            System.out.println(testScan);

//            AnnotationConfigApplicationContext annoContext = new AnnotationConfigApplicationContext(MainConfiguration.class, ProfileConfiguration.class);
        AnnotationConfigApplicationContext annoContext = new AnnotationConfigApplicationContext();
        annoContext.getEnvironment().setActiveProfiles("test");
        annoContext.register(MainConfiguration.class);
        annoContext.refresh();
//            TestScan testScan = annoContext.getBean(TestScan.class);
//            System.out.println(testScan);
//            Employee employee = annoContext.getBean(Employee.class);
//            System.out.println(employee);
        Person person = annoContext.getBean(Person.class);

        System.out.println(person);
        String[] names = annoContext.getBeanNamesForType(Person.class);
    }
}
