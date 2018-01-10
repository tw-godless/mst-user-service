package com.thoughtworks.mstorderservice.api;

import com.thoughtworks.mstorderservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getUserAddress(@RequestParam String userName) {
        return userService.getUserAddress(userName).getName();
    }
}
