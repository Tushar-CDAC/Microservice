package com.app.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.core.entity.User;
import com.app.core.service.IUserService;
//import com.app.core.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService iUserService;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		// return this.iUserService.getUser(userId);
		User user = this.iUserService.getUser(userId);

		// http://localhost:9002/contact/user/11
		// calling another service
		
		//List contacts = this.restTemplate.getForObject("http://localhost:9002/contact/user/11", List.class); // hardcoded user id
		//List contacts = this.restTemplate.getForObject("http://localhost:9002/contact/user/"+user.getUserId(), List.class);
		List contacts = this.restTemplate.getForObject("http://CONTACT-SERVICE/contact/user/"+user.getUserId(), List.class);
		
		user.setContact(contacts);
		return user;

	}

}
