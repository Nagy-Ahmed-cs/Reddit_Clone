package com.Reddit.reddit_clone.Model.Dtos.CommunityDtos;

import com.Reddit.reddit_clone.Model.Entities.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder

public class CommunityResDto {
    private String communityName;
    private String communityDesc;
    private LocalDateTime createAt;
    private String createdByName;
    private String createdByEmail;

}
