package sprinbootlearn.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFIrstService {

    // @Autowired
    // @Qualifier("bean1")
    private MyFirstClass myFirstClass;

    private Environment environment;

    // public MyFIrstService(MyFirstClass myFirstClass) {
    // this.myFirstClass = myFirstClass;
    // }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Autowired
    public void injectDependencies(@Qualifier("bean1") MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;

    }

    public String tellAStory() {
        return "This first service returns=>" + myFirstClass.sayHello();
    }

    public void javaVersion() {
        System.out.println(environment.getProperty("java.version"));
    }

}
