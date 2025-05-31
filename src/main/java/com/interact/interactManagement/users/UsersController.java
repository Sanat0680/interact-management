package com.interact.interactManagement.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/dev")
@RestController
public class UsersController {
    @Autowired
    UserService service;

    @GetMapping("/api/users")
    public List<UserPojo> getBinTransferLogs() {
        return service.getAllUsers();
    }


    @PostMapping("/login")
    public UserPojo login(@RequestBody LoginRequest req ) {
        return service.loginUser(req.getUsername(), req.getPassword());
    }


}
