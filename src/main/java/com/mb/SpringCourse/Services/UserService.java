package com.mb.SpringCourse.Services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mb.SpringCourse.Models.User;
import com.mb.SpringCourse.Models.Repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User findById(Long id) {
		return userRepository.findById(id).orElse(null);
	}
	public List<User> findAll(){
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);;
		return users;
	}
	public User save(User user) {
		return userRepository.save(user);
	}
}
