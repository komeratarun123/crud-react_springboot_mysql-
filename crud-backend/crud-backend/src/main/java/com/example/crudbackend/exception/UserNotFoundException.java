package com.example.crudbackend.exception;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(Long id) {
		super("can't find user by id");
	}

}
