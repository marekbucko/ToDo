package pl.sda.todolist.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.todolist.model.ToDoTask;
import pl.sda.todolist.repository.ToDoRepository;
import pl.sda.todolist.service.ToDoService;

@RestController
@RequestMapping("/todo")
public class ToDoController {

    @Autowired
    private ToDoService toDoService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ToDoTask addTask(@RequestBody ToDoTask newToDoTask) {
        return toDoService.add(newToDoTask);
    }


//    @RequestMapping(path = "/todoTest", method = RequestMethod.GET)
//    public ResponseEntity<ToDoTask> test() {
//        return ResponseEntity.ok(new ToDoTask());
//    }
}
