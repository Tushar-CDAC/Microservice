package com.app.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.core.entity.Contact;
import com.app.core.service.IContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private IContactService iUserService;
	
	@RequestMapping("/contactid/{userId}")
	public List<Contact> getContacts(@PathVariable("userId") Long userId){
		return this.iUserService.getContactsOfUser(userId);
		
	}
}
