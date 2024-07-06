package com.todoapp.todo.controller;

import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todoapp.todo.entity.TodoItem;
import com.todoapp.todo.repository.TodoRepo;

@RestController       //make this class rest endpoints (means we can tneract with it using get,patch,put)
@RequestMapping(value = "/todo")
public class TodoController {
	
	@Autowired
	private TodoRepo  todoRepo;
	
	
	@GetMapping
	public List<TodoItem> findAll()
	{
		return todoRepo.findAll();	
	}
	
	@PostMapping
	public TodoItem save(@NotNull @RequestBody TodoItem todoItem) 
	{
		return todoRepo.save(todoItem);
		
	}
	
	@PutMapping
	public TodoItem update( @NotNull @RequestBody  TodoItem todoItem)
	{
		return todoRepo.save(todoItem);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id)
	{
		 todoRepo.deleteById(id);
	}

}
