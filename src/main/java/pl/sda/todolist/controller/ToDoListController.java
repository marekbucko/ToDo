package pl.sda.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.todolist.model.ToDoTask;
import pl.sda.todolist.repository.ToDoRepository;
import pl.sda.todolist.service.ToDoListService;

import java.util.List;


@RestController
@RequestMapping("/todolist")
public class ToDoListController {

    @Autowired
    private ToDoListService toDoListService;

    @Autowired
    private ToDoRepository toDoRepository;


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ToDoTask> getAll() {
        return toDoRepository.findAll();
    }
}

