package pl.sda.todolist.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.todolist.model.ToDoTask;
import pl.sda.todolist.repository.ToDoRepository;


@Service
public class ToDoService {

    @Autowired
    public ToDoRepository toDoRepository;


    public ToDoTask add(ToDoTask newToDoTask) {
        toDoRepository.save(newToDoTask);
        return newToDoTask;
    }
}
