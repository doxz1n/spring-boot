package aula01.aula01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Aula01Application {

	public static void main(String[] args) {SpringApplication.run(Aula01Application.class, args);
		System.out.println("Conectado com sucesso!");
	}

	@GetMapping("/")
	public String olaMundo(){
		return "Hello World";
	}

}
