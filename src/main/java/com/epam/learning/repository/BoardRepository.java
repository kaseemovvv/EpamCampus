package com.epam.learning.repository;

import com.epam.learning.entity.BoardEntity;
import com.epam.learning.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface BoardRepository extends CrudRepository<BoardEntity, Integer> {
    Optional<BoardEntity> findByUserIdAndTitle(Integer userId, String title);
    Optional<BoardEntity> findAllByUserId(Integer userId);
}