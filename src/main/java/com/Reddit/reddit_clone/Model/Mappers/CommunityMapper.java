package com.Reddit.reddit_clone.Model.Mappers;

import com.Reddit.reddit_clone.Model.Dtos.CommunityDtos.CommunityReqDto;
import com.Reddit.reddit_clone.Model.Dtos.CommunityDtos.CommunityResDto;
import com.Reddit.reddit_clone.Model.Entities.Community;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommunityMapper {
    Community toEntity(CommunityReqDto dto);
    List<CommunityResDto>toResponses(List<Community>communities);
    CommunityResDto toResponse(Community community);

}
