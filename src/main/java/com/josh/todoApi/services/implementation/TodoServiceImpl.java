package com.josh.todoApi.services.implementation;

import java.util.List;
import java.util.Optional;

import com.josh.todoApi.models.Todo;
import com.josh.todoApi.repositories.TodoRepository;
import com.josh.todoApi.services.TodoService;

public class TodoServiceImpl implements TodoService {

    private TodoRepository todoRepository;

    @Override
    public List<Todo> getAllTodos() {
        List<Todo> todos = todoRepository.findAll();
        return todos;
    }

    @Override
    public Todo getTodo(Long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        if(todo.isPresent()){
            return todo.get();
        }
        else{
            return new Todo();
        }
    }

    @Override
    public Todo createTodo(Todo todo) {
        Todo newTodo = new Todo();
        newTodo.setTitle(todo.getTitle());
        newTodo.setBody(todo.getBody());

        return todoRepository.save(newTodo);
    }

    @Override
    public Todo updateTodo(Long id, Todo todo) {
        Todo oldTodo = todoRepository.findById(id).get();
        
        oldTodo.setTitle(todo.getTitle());
        oldTodo.setBody(todo.getBody());

        return todoRepository.save(oldTodo);
    }

    @Override
    public String deleteTodo(Long id) {
        Todo todo = todoRepository.findById(id).get();

        todoRepository.delete(todo);
        return "Deleted todo";
    }
    
}
