package com.flipkart.service.serviceImp;

import com.flipkart.constant.ApplicationConstant;
import com.flipkart.entity.FlipkartUser;
import com.flipkart.exception.UserAlredyExist;
import com.flipkart.request.FlipkartUserRequest;
import com.flipkart.response.FlipkartUserResponse;
import com.flipkart.service.UserService;
import com.flipkart.service.dbHelper.UserDbHelper;
import com.flipkart.service.mapper.FlipkartUserMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    public FlipkartUserMapping mapping;

    @Autowired
    private UserDbHelper dbHelper;

    Logger logger = LoggerFactory.getLogger(UserServiceImp.class);

    @Override
    public FlipkartUserResponse userSignUp(FlipkartUserRequest request) {

        FlipkartUser flipkartUser = dbHelper.findByEmail(request.getEmail()).orElseThrow(() -> new UserAlredyExist(ApplicationConstant.USER_ALREADY_EXITS));

        logger.info(flipkartUser.toString() );
        FlipkartUser flipkartUsermAP = mapping.requestToUserEntity(request);

        FlipkartUser saved = dbHelper.saveUser(flipkartUsermAP);

        FlipkartUserResponse flipkartUserResponse = mapping.userEntityToresponse(saved);

        return flipkartUserResponse;
    }
}
