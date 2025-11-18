package com.Reddit.reddit_clone.model.mappers;

import com.Reddit.reddit_clone.model.dtos.UserDtos.UserReqDto;
import com.Reddit.reddit_clone.model.dtos.UserDtos.UserResDto;
import com.Reddit.reddit_clone.model.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserReqDto dto);
    UserResDto toResponse(User user);
}
