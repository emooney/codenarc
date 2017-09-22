package codenarc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeNarcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeNarcApplication.class, args);
		System.out.println("Hello World");
	}

}
