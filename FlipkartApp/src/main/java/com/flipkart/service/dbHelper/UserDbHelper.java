package com.flipkart.service.dbHelper;

import com.flipkart.entity.FlipkartUser;
import com.flipkart.repository.FlipkartUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDbHelper {

    @Autowired
    private FlipkartUserRepo flipkartUserRepo;

    public FlipkartUser saveUser(FlipkartUser flipkartUser) {
        return flipkartUserRepo.save(flipkartUser);
    }

    public Optional<FlipkartUser> findByEmail(String email) {

        Optional<FlipkartUser> byEmail = flipkartUserRepo.findByEmail(email);
        return byEmail;
    }
}
