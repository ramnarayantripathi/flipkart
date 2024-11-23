package com.flipkart.service.mapper;

import com.flipkart.entity.FlipkartUser;
import com.flipkart.request.FlipkartUserRequest;
import com.flipkart.response.FlipkartUserResponse;
import org.springframework.stereotype.Component;

@Component
public class FlipkartUserMapping {

    public FlipkartUser requestToUserEntity(FlipkartUserRequest request) {
        FlipkartUser user = new FlipkartUser();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setEmail(request.getEmail());
        return user;
    }

    public FlipkartUserResponse userEntityToresponse(FlipkartUser saved) {
        FlipkartUserResponse response = FlipkartUserResponse.builder()
                .userId(saved.getUserId())
                .username(saved.getUsername())
                .email(saved.getEmail())
                .build();
        return response;
    }
}
