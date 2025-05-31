package com.interact.interactManagement.users;

import com.interact.interactManagement.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContextException;
import org.springframework.stereotype.Service;
import com.interact.interactManagement.entities.Users;
import java.util.List;
@Service
@Slf4j
public class UsersServiceImpl implements UserService{
@Autowired
private UserRepository userRepository;
protected final Log logger = LogFactory.getLog(this.getClass());
@Autowired
UserMapper userMapper;
    @Override
    public List<UserPojo> getAllUsers() {
        return userRepository.findAll().stream().map(e ->userMapper.entityToPojo(e)).toList();
     }

    @Override
    public UserPojo loginUser(String userName, String password) {
        Users loginUser=userRepository.findByUserName(userName);
        if(loginUser.getPassword().equals(password)){
            logger.info("Auth Successful");
            return userMapper.entityToPojo(loginUser);
        }
        else
        {
            throw new ApplicationContextException("Invalid Credentials");
        }
//        return userMapper.entityToPojo(loginUser);

    }


}
