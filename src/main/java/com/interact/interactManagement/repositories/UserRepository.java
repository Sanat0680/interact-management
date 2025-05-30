package com.interact.interactManagement.repositories;

import com.interact.interactManagement.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users,Integer> {

    public List<Users> findAll();
}
