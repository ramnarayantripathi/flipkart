package com.flipkart.service;

import com.flipkart.request.FlipkartUserRequest;
import com.flipkart.response.FlipkartUserResponse;

public interface UserService {
    FlipkartUserResponse userSignUp(FlipkartUserRequest request);
}
