package com.interact.interactManagement.repositories;

import com.interact.interactManagement.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Integer> {

    public List<Users> findAll();

    @Query("Select a from Users a where a.username=:userName")
    public Users findByUserName(@Param("userName") String userName);
}
