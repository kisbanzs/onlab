package aut.bme.ToDoApp.Repository;

import aut.bme.ToDoApp.Models.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll(Sort sort);
    User findByUsername(String username);
}