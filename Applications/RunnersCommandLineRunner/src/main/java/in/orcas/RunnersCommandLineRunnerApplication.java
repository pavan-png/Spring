package in.orcas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RunnersCommandLineRunnerApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RunnersCommandLineRunnerApplication.class, args);
	}

}
