package com.Reddit.reddit_clone.Model.Mappers;

import com.Reddit.reddit_clone.Model.Dtos.UserDtos.UserReqDto;
import com.Reddit.reddit_clone.Model.Dtos.UserDtos.UserResDto;
import com.Reddit.reddit_clone.Model.Entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserReqDto dto);
    UserResDto toResponse(User user);
}
