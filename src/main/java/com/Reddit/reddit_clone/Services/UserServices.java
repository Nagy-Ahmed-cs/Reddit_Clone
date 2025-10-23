package com.Reddit.reddit_clone.Services;

import com.Reddit.reddit_clone.Model.Dtos.UserDtos.UserReqDto;
import com.Reddit.reddit_clone.Model.Dtos.UserDtos.UserResDto;
import com.Reddit.reddit_clone.Model.Dtos.UserDtos.UserUpdateDto;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service

public interface UserServices {
    UserResDto createAccount(UserReqDto dto, MultipartFile image) throws IOException;
    Boolean logIn (String userEmail, String password);
    UserResDto updateProfile(UserUpdateDto dto, MultipartFile image) throws IOException;
    String deleteAccount(String userEmail);
}
