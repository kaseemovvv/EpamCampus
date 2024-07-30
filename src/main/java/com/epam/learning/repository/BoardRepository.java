package com.epam.learning.repository;

import com.epam.learning.entity.BoardEntity;
import com.epam.learning.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BoardRepository extends CrudRepository<BoardEntity, Integer> {

}