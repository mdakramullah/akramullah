package com.nt.service;

import java.util.List;

import com.nt.entity.UserEntity;

public interface UserService {

	public String upsert(UserEntity userEntity);
	public UserEntity getById(Integer userId);
	public List<UserEntity> getAllUsers();
	public String updateUser(UserEntity userEntity);
	public String deleteById(Integer userId);
	
}
