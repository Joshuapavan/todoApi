package com.josh.todoApi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.josh.todoApi.models.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long>{

}
