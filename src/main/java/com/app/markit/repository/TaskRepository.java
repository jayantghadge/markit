package com.app.markit.repository;

import com.app.markit.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository <Task, Long> {
}
