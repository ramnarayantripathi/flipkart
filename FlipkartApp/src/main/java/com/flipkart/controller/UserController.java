package com.flipkart.controller;

import com.flipkart.request.FlipkartUserRequest;
import com.flipkart.response.FlipkartUserResponse;
import com.flipkart.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/user")
public class UserController {

   private static final Logger logger = LoggerFactory.getLogger(UserController.class);
   @Autowired
   public UserService service;

   @RequestMapping(path = "/sign-up",method = RequestMethod.POST)
   @ResponseBody
   ResponseEntity<FlipkartUserResponse> userSignUp(@RequestBody FlipkartUserRequest request){

       logger.info("********* Request"+request);
       return ResponseEntity.ok(service.userSignUp(request));
   }




}
