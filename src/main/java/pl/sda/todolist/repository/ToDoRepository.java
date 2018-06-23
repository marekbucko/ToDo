package pl.sda.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.todolist.model.ToDoTask;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoTask, Long> {
}
