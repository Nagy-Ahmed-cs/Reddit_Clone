package com.Reddit.reddit_clone.Model.Dtos.UserDtos;

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

}
