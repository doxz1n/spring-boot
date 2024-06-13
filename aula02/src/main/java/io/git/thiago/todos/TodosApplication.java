package io.git.thiago.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.git.thiago.todos.repository.TodoRepository;


@SpringBootApplication

public class TodosApplication {
	
		
	
	
	public static void main(String[] args) {
		SpringApplication.run(TodosApplication.class, args);
	}

}
