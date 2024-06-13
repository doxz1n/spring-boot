package io.git.thiago.todos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.git.thiago.todos.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
	
	
}
