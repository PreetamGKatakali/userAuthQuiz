package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.User;

public interface UserDao extends JpaRepository<User, String> {
	
	
}
