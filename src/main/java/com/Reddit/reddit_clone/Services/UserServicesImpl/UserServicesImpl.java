package com.Reddit.reddit_clone.Services.UserServicesImpl;

import com.Reddit.reddit_clone.Model.Dtos.UserReqDto;
import com.Reddit.reddit_clone.Model.Dtos.UserResDto;
import com.Reddit.reddit_clone.Model.Dtos.UserUpdateDto;
import com.Reddit.reddit_clone.Model.Entities.User;
import com.Reddit.reddit_clone.Model.Mappers.UserMapper;
import com.Reddit.reddit_clone.Repos.UserRepo;
import com.Reddit.reddit_clone.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service

public class UserServicesImpl implements UserServices
{
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserResDto createAccount(UserReqDto dto) {
        User user=userMapper.toEntity(dto);
        return userMapper.toResponse(userRepo.save(user));
    }

    @Override
    public Boolean logIn(String userEmail, String password) {
        Optional<User>user=userRepo.findByUserEmailAndPassword(userEmail, password);
        return user.isPresent();
    }

    @Override
    public UserResDto updateProfile(UserUpdateDto dto) {
        Optional<User> user=userRepo.findById(dto.getUserId());
        if(user.isPresent()){
            user.get().setUpdateAt(LocalDateTime.now());
            user.get().setUserName(dto.getUserName());
            user.get().setPassword(dto.getPassword());
            user.get().setImageName(dto.getImageName());
            user.get().setImageType(dto.getImageType());
            user.get().setImage(dto.getImage());
            return userMapper.toResponse(userRepo.save(user.get()));

        }
        else {
            return null;
        }
    }

    @Override
    public String deleteAccount(String userEmail) {
        Optional<User>user=userRepo.findByUserEmail(userEmail);
        if(user.isPresent()){
            user.get().setDeleteAt(LocalDateTime.now());
            userRepo.save(user.get());
            return "Account delete successfully from the website ....\n";
        }
        return "The user is not here already ....\n";
    }
}
