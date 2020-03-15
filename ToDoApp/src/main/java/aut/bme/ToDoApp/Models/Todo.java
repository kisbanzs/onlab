package aut.bme.ToDoApp.Models;

import org.hibernate.annotations.NaturalId;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;
import java.time.Instant;


@Entity
@Table(name = "todo", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "description"
        }),
        @UniqueConstraint(columnNames = {
                "date"
        })
})
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 150)
    private String description;

    @NotBlank
    private Instant date;

    //minden todo pontosan egy userhez tartozik
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Todo() {

    }

    public Todo(String description, Instant date) {
        this.description = description;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }



}