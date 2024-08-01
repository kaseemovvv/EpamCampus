package com.epam.learning.service.impl;

import com.epam.learning.dto.BoardReqDto;
import com.epam.learning.dto.BoardResDto;
import com.epam.learning.entity.BoardEntity;
import com.epam.learning.exeption.AlreadyExistException;
import com.epam.learning.exeption.NotFoundException;
import com.epam.learning.mapper.BoardMapper;
import com.epam.learning.repository.BoardRepository;
import com.epam.learning.repository.UserRepository;
import com.epam.learning.service.BoardService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
    private final BoardRepository repository;
    private final BoardMapper mapper;
    private final UserRepository userRepository;


    public BoardServiceImpl(BoardRepository boardRepository, BoardMapper mapper, UserRepository userRepository) {
        this.repository = boardRepository;
        this.mapper = mapper;
        this.userRepository = userRepository;
    }

    @Override
    public BoardResDto createBoard(BoardReqDto boardDto, Integer userId) {
        repository.findByUserIdAndTitle(userId, boardDto.getTitle()).orElseThrow(() -> new AlreadyExistException("Already exist Board with this name"));
        BoardEntity boardEntity = mapper.dtoToEntity(boardDto);
        boardEntity.setUserId(userId);
        BoardEntity save = repository.save(boardEntity);
        return mapper.entityToDto(save);
    }

    @Override
    public BoardResDto updateBoard(Integer id, BoardReqDto board) {
        BoardEntity boardEntity = repository.findById(id).orElseThrow(() -> new NotFoundException("Board with this id does not exist"));
        if (board.getTitle() != null) {
            boardEntity.setTitle(board.getTitle());
        }
        if (board.getOrderNumber() != null) {
            boardEntity.setOrderNumber(board.getOrderNumber());
        }
        BoardEntity save = repository.save(boardEntity);
        return mapper.entityToDto(save);
    }

    @Override
    public String deleteBoard(Integer id) {
        repository.findById(id).orElseThrow(() -> new NotFoundException("Board with this id does not exist"));
        repository.deleteById(id);
        return String.valueOf(id);
    }

    @Override
    public BoardResDto getBoard(Integer id) {
        BoardEntity boardEntity = repository.findById(id).orElseThrow(() -> new NotFoundException("Board with this id does not exist"));
        return mapper.entityToDto(boardEntity);
    }

    @Override
    public List<BoardResDto> getAllBoards(Integer userId) {
        userRepository.findById(userId).orElseThrow(() -> new NotFoundException("User not found by " + userId));
        return repository.findAllByUserId(userId)
                .stream()
                .map(mapper::entityToDto)
                .toList();
    }
}
