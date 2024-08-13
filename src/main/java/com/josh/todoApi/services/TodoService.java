package com.josh.todoApi.services;

import java.util.List;

import com.josh.todoApi.models.Todo;

public interface TodoService {

    List<Todo> getAllTodos();

    Todo getTodo(Long id);

    Todo createTodo(Todo todo);

    Todo updateTodo(Long id, Todo todo);

    String deleteTodo(Long id);
    
}
