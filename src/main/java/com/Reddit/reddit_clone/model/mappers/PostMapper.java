package com.Reddit.reddit_clone.model.mappers;

import com.Reddit.reddit_clone.model.dtos.postDtos.PostReqDto;
import com.Reddit.reddit_clone.model.dtos.postDtos.PostResDto;
import com.Reddit.reddit_clone.model.entities.Post;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PostMapper {

    Post toEntity(PostReqDto post);
    PostResDto toResponse(Post post);
    List<PostResDto>toResponses(List<Post>posts);

}
