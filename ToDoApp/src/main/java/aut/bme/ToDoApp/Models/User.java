package aut.bme.ToDoApp.Models;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.NaturalId;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "username"
        }),
        @UniqueConstraint(columnNames = {
                "email"
        })
})
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotBlank
@Size(max = 40)
private String name;

@NotBlank
@Size(max = 15)
private String username;

@NaturalId
@NotBlank
@Size(max = 40)
@Email
private String email;

@NotBlank
@Size(max = 100)
private String password;

//minden usernek lehet több todoja
@OneToMany(
        mappedBy = "user",
        cascade = CascadeType.ALL,
        fetch = FetchType.EAGER,
        orphanRemoval = true
)
@Fetch(FetchMode.SELECT)
@BatchSize(size = 30)
private List<Todo> todos = new ArrayList<>();


public User() {

        }

public User(String name, String username, String email, String password) {
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        }

public Long getId() {
        return id;
        }

public void setId(Long id) {
        this.id = id;
        }

public String getUsername() {
        return username;
        }

public void setUsername(String username) {
        this.username = username;
        }

public String getName() {
        return name;
        }

public void setName(String name) {
        this.name = name;
        }

public String getEmail() {
        return email;
        }

public void setEmail(String email) {
        this.email = email;
        }

public String getPassword() {
        return password;
        }

public void setPassword(String password) {
        this.password = password;
        }

public List<Todo> getTodos() {
        return todos;
        }

public void setTodos(List<Todo> todo) {
        this.todos= this.todos;
        }

public void addTodo(Todo todo) {
        todos.add(todo);
        todo.setUser(this);
        }

public void removeTodo(Todo todo) {
        todos.remove(todo);
        //todos.setUser(null);
        }

        }