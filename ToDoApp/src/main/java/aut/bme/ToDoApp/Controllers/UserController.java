package aut.bme.ToDoApp.Controllers;

import aut.bme.ToDoApp.Models.User;
import aut.bme.ToDoApp.Payload.UserProfile;
import aut.bme.ToDoApp.Payload.UserRequest;
import aut.bme.ToDoApp.Repository.UserRepository;
import aut.bme.ToDoApp.Services.TodoService;
import aut.bme.ToDoApp.Services.UserService;
import aut.bme.ToDoApp.utils.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private TodoService todoService;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/users")
    public List<UserProfile> getAllUserProfiles() {
        List<User> users = userRepository.findAll(Sort.by("username"));
        List<UserProfile> responseList = new ArrayList<UserProfile>();
        for (User user : users) {
            responseList.add(ModelMapper.mapUserToUserResponse(user));
        }
        return responseList;
    }

    @GetMapping("/users/{id}")
    public UserProfile getUserProfile(@PathVariable(value = "id") Long id) {
        User user = userRepository.getOne(id);
        return ModelMapper.mapUserToUserResponse(user);
    }

    @PostMapping("/users")
    public UserProfile createUser(@RequestBody UserRequest userRequest) {
        return userService.createUser(userRequest);
    }
}
