package com.bridgelabz.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.dao.User;

public interface UserRepository  extends JpaRepository<User, Integer>{
	
	Optional<User> findByUserName(String userName);
	
}
