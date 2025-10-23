package com.Reddit.reddit_clone.Controllers;

import com.Reddit.reddit_clone.Model.Dtos.UserDtos.UserReqDto;
import com.Reddit.reddit_clone.Model.Dtos.UserDtos.UserResDto;
import com.Reddit.reddit_clone.Model.Dtos.UserDtos.UserUpdateDto;
import com.Reddit.reddit_clone.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController

public class UserController {
    @Autowired
    private UserServices userServices;
    @PostMapping("/create-account")
    public ResponseEntity<UserResDto>createAccount(
            @RequestPart UserReqDto dto, @RequestPart MultipartFile image){
        return ResponseEntity.ok(userServices.createAccount(dto));
    }
    @GetMapping("/login")
    public ResponseEntity<Boolean>logIn(@RequestParam String userEmail,@RequestParam String password){
        return ResponseEntity.ok(userServices.logIn(userEmail, password));
    }
    @GetMapping("/update-profile")
    public ResponseEntity<UserResDto>updateUser(@RequestBody UserUpdateDto dto){
        return ResponseEntity.ok(userServices.updateProfile(dto));
    }
    @PostMapping("/delete-account")
    public ResponseEntity<String> deleteAccount(@RequestParam String userEmail){
        return ResponseEntity.ok(userServices.deleteAccount(userEmail));
    }



}
