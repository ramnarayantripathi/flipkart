package com.flipkart.repository;

import com.flipkart.entity.FlipkartUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FlipkartUserRepo extends JpaRepository<FlipkartUser, Integer> {

    Optional<FlipkartUser> findByEmail(String email);
}
