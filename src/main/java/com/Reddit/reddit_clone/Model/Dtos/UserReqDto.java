package com.Reddit.reddit_clone.Model.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UserReqDto {
    private String userName;
    private String userEmail;
    private String password;
    private String phoneNumber;
    private String imageName;
    private String imageType;
    private byte [] image;

}
