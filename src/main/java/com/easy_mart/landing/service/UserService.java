package com.easy_mart.landing.service;

import java.util.List;


import com.easy_mart.landing.domain.User;




public interface UserService {

	List<User> getAllUsers();
	User getUserById(String id);
	User saveUser(User user);
	void deleteUser(String id);
}
