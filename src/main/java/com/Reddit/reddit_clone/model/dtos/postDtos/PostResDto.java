package com.Reddit.reddit_clone.model.dtos.postDtos;

import com.Reddit.reddit_clone.model.entities.Community;
import com.Reddit.reddit_clone.model.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class PostResDto {
    private String content;
    private String title;
    private User user;
    private Community community;
    private LocalDateTime createAt;

}
