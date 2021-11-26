package com.app.core.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.app.core.entity.Contact;

@Service
public class ContactServiceImpl implements IContactService{

	//Fake list of contacts
	//public Contact(Long cId, String email, String contactName, Long userId)
	
	List<Contact> list = List.of(
			new Contact((long)1,"tushar@gmail.com","Tushar",(long)11),
			new Contact((long)2,"komal@gmail.com","komal",(long)12),
			new Contact((long)3,"ameya@gmail.com","ameya",(long)13),
			new Contact((long)4,"mayank@gmail.com","mayank",(long)14)
			);
			
			
	
	@Override
	public List<Contact> getContactsOfUser(Long UserId) {
		
		return list.stream().filter(contact ->
		contact.getUserId().equals(UserId)).collect(Collectors.toList());
	}

}
