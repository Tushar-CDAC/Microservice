package com.app.core.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.core.entity.Contact;

@Service
public interface IContactService {
	
	public List<Contact> getContactsOfUser(Long UserId);
	
}
