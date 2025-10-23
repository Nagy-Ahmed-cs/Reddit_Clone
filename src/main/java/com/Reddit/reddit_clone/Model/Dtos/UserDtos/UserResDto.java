package com.Reddit.reddit_clone.Model.Dtos.UserDtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResDto {
    private String userName;
    private String imageName;
    private String imageType;
    private byte [] image;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

}
