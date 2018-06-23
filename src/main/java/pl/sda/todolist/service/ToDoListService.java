package pl.sda.todolist.service;

import org.springframework.web.bind.annotation.RestController;
import pl.sda.todolist.model.ToDoTask;

import java.util.ArrayList;
import java.util.List;
@RestController
public class ToDoListService {


        private List<ToDoTask> list = new ArrayList<>();

        public List<ToDoTask> search() {
            return list;
        }

    }
