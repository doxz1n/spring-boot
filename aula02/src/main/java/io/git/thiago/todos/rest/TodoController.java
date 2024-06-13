package io.git.thiago.todos.rest;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import io.git.thiago.todos.model.Todo;
import io.git.thiago.todos.repository.TodoRepository;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
	
	@Autowired
	private TodoRepository repository;
	
	//Post 
	@PostMapping
	public Todo save( @RequestBody Todo todo) {
		return repository.save(todo);
				
	}
	
	//Get  url/api/todo/1
	@GetMapping("{id}")
	public Todo getById(@PathVariable Long id) {
		return repository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	
	
}
