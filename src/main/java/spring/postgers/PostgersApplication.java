package spring.postgers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class PostgersApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgersApplication.class, args);
	}

}
