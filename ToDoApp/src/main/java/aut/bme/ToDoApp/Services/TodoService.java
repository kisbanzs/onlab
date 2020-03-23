package aut.bme.ToDoApp.Services;

import aut.bme.ToDoApp.Payload.TodoRequest;
import aut.bme.ToDoApp.Payload.TodoResponse;
import aut.bme.ToDoApp.Repository.TodoRepository;
import aut.bme.ToDoApp.Repository.UserRepository;
import aut.bme.ToDoApp.utils.ModelMapper;
import aut.bme.ToDoApp.Models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(TodoService.class);

    public List<TodoResponse> getAllTodos() {
        List<Todo> todos = todoRepository.findAll();
        List<TodoResponse> responseList = new ArrayList<TodoResponse>();
        for (Todo todo : todos) {
            responseList.add(ModelMapper.mapTodoToTodoResponse(todo));
        }
        return responseList;
    }

    public List<TodoResponse> getTodosCreatedBy(Long userId) {
        return todoRepository.getTodosCreatedBy(userId).stream().map(ModelMapper::mapTodoToTodoResponse).collect(Collectors.toList());
    }

    public TodoResponse createTodo(Long userId, TodoRequest todoRequest) {
        User user = userRepository.getOne(userId);
        Todo todo = new Todo();
        todo.setUser(user);
        todo.setDescription(todoRequest.getDescription());
        todo.setDate(todoRequest.getDate());
        return ModelMapper.mapTodoToTodoResponse(todoRepository.save(todo));
    }
}
