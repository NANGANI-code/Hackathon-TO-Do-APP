package com.example.todoapp.datalayer.repository;

import com.example.todoapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findByCompleted(boolean completed);

    List<Task> findByPriority(String priority);

    List<Task> findByDueDateBefore(LocalDate date);

    List<Task> findByDueDate(LocalDate dueDate);
}
