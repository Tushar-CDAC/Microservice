package com.app.core.service;

import java.util.List;

import org.springframework.stereotype.Service;



import com.app.core.entity.User;

@Service
public class UserServiceImpl implements IUserService {

	//fake list
	
	List<User> list = List.of(
			new User((long) 11,"Tushar","8888888"),
			new User((long) 12,"Komal","9999999"),
			new User((long) 13,"Ameya","7777777"),
			new User((long) 14,"Mayank","555555")
			);
	
	
	@Override
	public User getUser(Long id) {
		
		return this.list.stream().filter(user -> 
		user.getUserId().equals(id)).findAny().orElse(null);
		
	}

}
