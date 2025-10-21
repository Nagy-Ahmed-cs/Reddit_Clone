package com.Reddit.reddit_clone.Services;

import com.Reddit.reddit_clone.Model.Dtos.UserReqDto;
import com.Reddit.reddit_clone.Model.Dtos.UserResDto;
import com.Reddit.reddit_clone.Model.Dtos.UserUpdateDto;
import org.springframework.stereotype.Service;

@Service

public interface UserServices {
    UserResDto createAccount(UserReqDto dto);
    Boolean logIn (String userEmail, String password);
    UserResDto updateProfile(UserUpdateDto dto);
    String deleteAccount(String userEmail);
}
