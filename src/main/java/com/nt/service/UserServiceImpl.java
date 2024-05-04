package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.UserEntity;
import com.nt.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository repo;
	
	@Override
	public String upsert(UserEntity userEntity) {
		repo.save(userEntity);
		return "Data Successfully Inserted";
	}

	@Override
	public UserEntity getById(Integer userId) {
	Optional<UserEntity> op=repo.findById(userId);
	if(op.isPresent()) {
		return op.get();
	}
		return null;
	}

	@Override
	public List<UserEntity> getAllUsers() {
	List<UserEntity>list=repo.findAll();
		return list;
	}

	@Override
	public String updateUser(UserEntity userEntity) {
		repo.save(userEntity);
		return "User Update Successfully";
	}

	@Override
	public String deleteById(Integer userId) {
		repo.deleteById(userId);
		return "User Delete Successfully";
	}

	

}
