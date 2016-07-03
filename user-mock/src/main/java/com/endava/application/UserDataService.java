package com.endava.application;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class UserDataService {

	
	
	public User getUserById(int userId) {
		Map<Integer, User> users=getUsers();
		return users.get(userId);
	}

	public Map<Integer, User> getUsers() {
		Map<Integer, User> userData = new HashMap<Integer, User>();
		User user1=new User();
		user1.setId(1);
		user1.setName("Sandrina Filipovska");
		user1.setMail("sandrina_filipovska@yahoo.com");
		user1.setSsn("123456789");
		userData.put(user1.getId(), user1);
		
		User user2=new User();
		user2.setId(2);
		user2.setName("Daniel Spasovski");
		user2.setMail("sdaniel506@yahoo.com");
		user2.setSsn("987654321");
		userData.put(user2.getId(), user2);
		
		User user3=new User();
		user3.setId(3);
		user3.setName("Mihail Filipovski");
		user3.setMail("mihailf@yahoo.com");
		user3.setSsn("256987123");
		userData.put(user3.getId(), user3);
		
		return userData;
		
	}

	public User getUserAccount(int userId) {
		
		return null;
	}

	
}
