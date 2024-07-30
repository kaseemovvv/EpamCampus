package com.epam.learning.repository;

import com.epam.learning.entity.BoardEntity;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepository extends CrudRepository<BoardEntity, Integer> {
}
