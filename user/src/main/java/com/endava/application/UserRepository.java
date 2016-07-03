package com.endava.application;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDto, Integer>{
	public List<UserDto> findAll();
}
