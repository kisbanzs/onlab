package aut.bme.ToDoApp.Controllers;

import aut.bme.ToDoApp.Payload.TodoRequest;
import aut.bme.ToDoApp.Payload.TodoResponse;
import aut.bme.ToDoApp.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class TodoController {

    @Autowired
    private TodoService todoService;

    // user todoinak lekérdezése
    @GetMapping("/users/{userId}/todos")
    public List<TodoResponse> getTodosCreatedBy(@PathVariable(value = "userId") Long userId) {
        return todoService.getTodosCreatedBy(userId);
    }

    // todo létrehozása userhez
    @PostMapping("/users/{userId}/todos")
    public TodoResponse createTodo(@PathVariable(value = "userId") Long userId, @RequestBody TodoRequest todoRequest) {
        return todoService.createTodo(userId, todoRequest);
    }
}

