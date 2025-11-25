package com.Reddit.reddit_clone.model.dtos.CommentDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CommentResDto {
    private String content;
    private Integer postId;
    private Integer userId;
    private LocalDateTime createAt;
    private boolean isEdited;

}
