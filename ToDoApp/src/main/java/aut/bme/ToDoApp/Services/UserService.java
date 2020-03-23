package aut.bme.ToDoApp.Services;

import aut.bme.ToDoApp.Payload.TodoRequest;
import aut.bme.ToDoApp.Payload.TodoResponse;
import aut.bme.ToDoApp.Payload.UserProfile;
import aut.bme.ToDoApp.Payload.UserRequest;
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
public class UserService {

    @Autowired
    private TodoService todoService;

    @Autowired
    private UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    public UserProfile createUser(UserRequest userRequest) {
        User user = new User(userRequest.getName(), userRequest.getUsername(), userRequest.getEmail(), userRequest.getPassword());
        User savedUser = userRepository.save(user);
        System.out.println(savedUser);
        return ModelMapper.mapUserToUserResponse(savedUser);
    }
}
