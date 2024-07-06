package com.todoapp.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todoapp.todo.entity.TodoItem;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {

}
