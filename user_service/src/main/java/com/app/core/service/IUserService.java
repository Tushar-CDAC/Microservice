package com.app.core.service;

import org.springframework.stereotype.Service;

import com.app.core.entity.User;

@Service
public interface IUserService {
	
	public User getUser(Long id);
}
