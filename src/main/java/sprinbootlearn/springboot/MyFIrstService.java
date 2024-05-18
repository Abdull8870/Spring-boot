package sprinbootlearn.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
// @PropertySource("classpath:custom.properties")
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom-2.properties")
})
public class MyFIrstService {

    // @Autowired
    // @Qualifier("bean1")
    private MyFirstClass myFirstClass;

    private Environment environment;

    @Value("Hello Ab")
    private String custonProperty;

    @Value("${mypro.pro}")
    private String cutomPropertyFromAnotherFile;

    @Value("123")
    private Integer customPropertyNumber;

    // public MyFIrstService(MyFirstClass myFirstClass) {
    // this.myFirstClass = myFirstClass;
    // }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Autowired
    public void injectDependencies(@Qualifier("bean1") MyFirstClass myFirstCls) {
        this.myFirstClass = myFirstCls;

    }

    public String tellAStory() {
        return "This first service returns=>" + myFirstClass.sayHello();
    }

    public void javaVersion() {
        System.out.println(environment.getProperty("java.version"));
    }

}
