package com.endava.application;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserDataService userDataService;
		
	@RequestMapping(value="/users", method=RequestMethod.GET)
	public Collection<User> getUsers(){
		return userDataService.getUsers().values();
	}

	@RequestMapping(value="user/{id}", method=RequestMethod.GET)
	public @ResponseBody User getUserById(@PathVariable int id){
		User userById = userDataService.getUserById(id);
		return userById;
	}
	
	public @ResponeBody 
}
