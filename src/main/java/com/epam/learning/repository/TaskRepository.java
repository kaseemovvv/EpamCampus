package com.epam.learning.repository;

import com.epam.learning.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskRepository extends CrudRepository<TaskEntity, Integer> {
    Optional<TaskEntity> findAllByBoardId(Integer boardId);
}
