package br.com.lny.webflux;

import br.com.lny.webflux.client.EmployeeWebClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxApplication.class, args);

		EmployeeWebClient employeeWebClient = new EmployeeWebClient();
		employeeWebClient.consume();
	}

}
