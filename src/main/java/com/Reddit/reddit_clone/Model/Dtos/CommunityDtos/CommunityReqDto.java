package com.Reddit.reddit_clone.Model.Dtos.CommunityDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class CommunityReqDto {
    private String communityName;
    private String communityDesc;
    private Integer userId;

}
