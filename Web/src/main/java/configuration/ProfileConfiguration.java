package configuration;

import entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfiguration {
    @Profile("test")
    @Bean()
    public Person person(){
        return new Person("test",28);
    }
}
