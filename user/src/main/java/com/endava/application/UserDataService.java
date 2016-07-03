package com.endava.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserDataMapper userDataMapper;
	
	public User getUserById(int userId) {
		List<UserDto> findDtos = userRepository.findAll();
		for (UserDto userDto : findDtos) {
			if (userDto.getId() == userId) {
				User userDtoToUser = userDataMapper.mapUserDtoToUser(userDto);
				return userDtoToUser;
			}
		}
		return new User();
	}

	public List<User> getUsers() {
		List<UserDto> userDtos = userRepository.findAll();
		return userDataMapper.mapUserDtosToUsers(userDtos);
	}

	
}
