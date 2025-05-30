package com.interact.interactManagement.users;

import com.interact.interactManagement.entities.Users;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserPojo entityToPojo(Users user);
    Users pojoToEntity(UserPojo dto);
}