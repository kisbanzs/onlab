package aut.bme.ToDoApp.utils;

import aut.bme.ToDoApp.Models.Todo;
import aut.bme.ToDoApp.Models.User;
import aut.bme.ToDoApp.Payload.TodoResponse;
import aut.bme.ToDoApp.Payload.UserProfile;

import java.time.Instant;

public class ModelMapper {

    public static TodoResponse mapTodoToTodoResponse(Todo todo) {
        TodoResponse todoResponse = new TodoResponse();
        todoResponse.setId(todo.getId());
        todoResponse.setDescription(todo.getDescription());
        todoResponse.setDate(todo.getDate());
        Instant now = Instant.now();
        todoResponse.setExpired(todo.getDate().isBefore(now));

        todoResponse.setUsername(todo.getUser().getUsername());

        return todoResponse;
    }

    public static UserProfile mapUserToUserResponse(User user) {
       return new UserProfile(user.getId(), user.getName(), user.getUsername(), user.getEmail());
    }
}
