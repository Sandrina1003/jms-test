package com.endava.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class UserDataMapper {

	public User mapUserDtoToUser(UserDto userDto) {
		User user = new User();
		
		user.setId(userDto.getId());
		user.setMail(userDto.getMail());
		user.setName(userDto.getName());
		user.setSsn(userDto.getSsn());
		
		return user;
	}
	
	public List<User> mapUserDtosToUsers(List<UserDto> userDtos) {
		List<User> users = new ArrayList<User>();
		
		for (UserDto userDto : userDtos) {
			User user = mapUserDtoToUser(userDto);
			users.add(user);
		}
		
		return users;
	}
}
