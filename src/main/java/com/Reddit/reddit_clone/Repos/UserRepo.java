package com.Reddit.reddit_clone.Repos;

import com.Reddit.reddit_clone.Model.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import javax.swing.text.html.Option;
import java.util.Optional;
@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User>findByUserEmail(String userEmail);
    Optional<User>findByPhoneNumber(String phoneNumber);
    Optional<User>findByUserEmailAndPassword(String userEmail, String password);
}
