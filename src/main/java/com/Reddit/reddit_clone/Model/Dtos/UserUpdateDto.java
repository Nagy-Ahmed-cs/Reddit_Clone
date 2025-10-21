package com.Reddit.reddit_clone.Model.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserUpdateDto {
    private Integer userId;
    private String userName;
    private String password;
    private String imageName;
    private String imageType;
    private byte [] image;
}
