package com.easy_mart.landing.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easy_mart.landing.domain.User;
import com.easy_mart.landing.exception.UserException;
import com.easy_mart.landing.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
    @Autowired
    private UserRepository userRepository;

    /**
     * Retrieve all users from the database.
     * 
     * @return List of all users.
     * @throws UserException if no users are found.
     */
    @Override
    public List<User> getAllUsers() {
        List<User> allUsers = userRepository.findAll();
        if (allUsers.isEmpty()) {
            throw new UserException("No data found");
        }
        return allUsers;
    }

    /**
     * Retrieve a user by their ID.
     * 
     * @param id the ID of the user to retrieve.
     * @return the user with the specified ID.
     * @throws UserException if the user is not found.
     */
    @Override
    public User getUserById(String id) {
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent()) {
            throw new UserException("User not found with id: " + id);
        }
        return user.get();
    }

    /**
     * Save a new user or update an existing user in the database.
     * 
     * @param user the user to save or update.
     * @return the saved or updated user.
     */
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    /**
     * Delete a user by their ID.
     * 
     * @param id the ID of the user to delete.
     * @throws UserException if the user is not found.
     */
    @Override
    public void deleteUser(String id) {
        if (!userRepository.existsById(id)) {
            throw new UserException("User not found with id: " + id);
        }
        userRepository.deleteById(id);
    }
}
