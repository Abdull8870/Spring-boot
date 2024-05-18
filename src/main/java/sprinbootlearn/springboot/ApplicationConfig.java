package sprinbootlearn.springboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    @Qualifier("bean1")
    public MyFirstClass myFirstBean() {
        return new MyFirstClass("first bean");
    }

    @Bean
    // @Qualifier("bean2")
    public MyFirstClass mySecondBean() {
        return new MyFirstClass("Second Bean");
    }

    @Bean
    // @Qualifier("bean2")
    public MyFirstClass myThirdBean() {
        return new MyFirstClass("third Bean");
    }
}
