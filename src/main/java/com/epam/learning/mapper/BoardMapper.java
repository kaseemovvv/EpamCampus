package com.epam.learning.mapper;

import com.epam.learning.dto.BoardReqDto;
import com.epam.learning.dto.BoardResDto;
import com.epam.learning.entity.BoardEntity;
import org.springframework.stereotype.Component;

@Component
public class BoardMapper {
    public BoardEntity dtoToEntity(BoardReqDto reqDto){
        BoardEntity boardEntity = new BoardEntity();
        boardEntity.setTitle(reqDto.getTitle());
        boardEntity.setOrderNumber(reqDto.getOrderNumber());
        return boardEntity;
    }

    public BoardResDto entityToDto(BoardEntity boardentity){
        BoardResDto resDto = new BoardResDto();
        resDto.setId(boardentity.getId());
        resDto.setOrderNumber(boardentity.getOrderNumber());
        resDto.setTitle(boardentity.getTitle());
        return resDto;
    }
}
