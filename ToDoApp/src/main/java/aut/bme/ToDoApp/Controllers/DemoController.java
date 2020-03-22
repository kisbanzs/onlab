package aut.bme.ToDoApp.Controllers;

import aut.bme.ToDoApp.Models.Todo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class DemoController {

    /*@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }*/

    @GetMapping("/todotest")
    public Todo hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Todo("asd", Instant.now());
    }

}

