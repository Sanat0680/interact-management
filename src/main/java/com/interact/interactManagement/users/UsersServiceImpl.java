package com.interact.interactManagement.users;

import com.interact.interactManagement.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UserService{
@Autowired
private UserRepository userRepository;
@Autowired
UserMapper userMapper;
    @Override
    public List<UserPojo> getAllUsers() {
        return userRepository.findAll().stream().map(e ->userMapper.entityToPojo(e)).toList();
     }
}
