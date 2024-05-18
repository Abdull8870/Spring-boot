package sprinbootlearn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(Application.class, args);

		MyFIrstService obj = ctx.getBean(MyFIrstService.class);
		System.out.println(obj.tellAStory());
		obj.javaVersion();

	}

}
