package com.userManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userManagement.Entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
