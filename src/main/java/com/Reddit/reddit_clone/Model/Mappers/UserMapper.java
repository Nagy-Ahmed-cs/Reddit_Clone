package com.Reddit.reddit_clone.Model.Mappers;

import com.Reddit.reddit_clone.Model.Dtos.UserReqDto;
import com.Reddit.reddit_clone.Model.Dtos.UserResDto;
import com.Reddit.reddit_clone.Model.Entities.User;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserReqDto dto);
    UserResDto toResponse(User user);
}
