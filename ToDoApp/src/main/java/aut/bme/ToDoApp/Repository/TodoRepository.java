package aut.bme.ToDoApp.Repository;

import aut.bme.ToDoApp.Models.Todo;
import aut.bme.ToDoApp.Models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<Todo> findAll();

    @Query("SELECT v FROM Todo v where v.user.id = :userId")
    List<Todo> getTodosCreatedBy(@Param("userId") Long userId);
}