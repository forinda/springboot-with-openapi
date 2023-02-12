package com.sample.demo.todos.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {

    @PostMapping("/")
    public List<NewTodoResponseEntity> getTodos(){
        return List.of(new NewTodoResponseEntity("Sample",false));
    }

    record NewTodoResponseEntity(String title,Boolean done){
    }
}
