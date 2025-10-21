package com.Reddit.reddit_clone.Model.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Where(clause = "delete_at is null")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    @Email(message = "Enter a valid mail format !!!!")
    @Column(unique = true)
    private String userEmail;
    @Size(min=3, max = 10)
    private String password;
    @Column(unique = true)
    private String phoneNumber;
    @CreationTimestamp
    private LocalDateTime createAt;
    @UpdateTimestamp
    private LocalDateTime updateAt;
    private LocalDateTime deleteAt; // this for soft delete ....
    private String imageName;
    private String imageType;
    @Lob
    private byte [] image;

}
