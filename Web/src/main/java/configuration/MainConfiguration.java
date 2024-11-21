package configuration;

import entity.Employee;
import entity.Person;
import entity.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;
import org.springframework.test.context.ActiveProfiles;

import java.util.Random;

@Configuration
@ComponentScan({"Processor"})
@Import(ProfileConfiguration.class)
public class MainConfiguration {
    private static final Random random = new Random(47);

    @Profile("run")
    @Bean(name="person")
    public Person person2(){
        return new Person("run",20);
    }
    @Profile("dev")
    @Bean(name="person")
    public Person person1(){
        return new Person("dev",90);
    }

    @Bean
//    @Autowired
    public Employee employee(Person person){
        return new Employee(person,Position.values()[random.nextInt(Position.values().length)]);
    }

    @Bean
    public TestScan testScan(){
        return new TestScan(null,Position.values()[random.nextInt(Position.values().length)]);
    }
}
