package com.example.crudbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.crudbackend.model.User;
public interface UserRepository extends JpaRepository<User, Long> {

}
