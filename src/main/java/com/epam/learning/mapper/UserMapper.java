package com.epam.learning.mapper;

import com.epam.learning.dto.TaskReqDto;
import com.epam.learning.dto.UserReqDto;
import com.epam.learning.dto.UserResDto;
import com.epam.learning.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserEntity dtoToEntity(UserReqDto reqDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setRole(reqDto.getRole());
        userEntity.setPassword(reqDto.getPassword());
        userEntity.setPhoneNumber(reqDto.getPhoneNumber());
        userEntity.setFullName(reqDto.getFullName());
        return userEntity;
    }

    public UserResDto entityToDto(UserEntity userEntity){
        UserResDto resDto = new UserResDto();
        resDto.setFullName(userEntity.getFullName());
        resDto.setRole(userEntity.getRole());
        resDto.setId(userEntity.getId());
        resDto.setPhoneNumber(userEntity.getPhoneNumber());
        return new UserResDto();
    }
}
