package com.interact.interactManagement.users;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService  {
    List<UserPojo> getAllUsers();
}
