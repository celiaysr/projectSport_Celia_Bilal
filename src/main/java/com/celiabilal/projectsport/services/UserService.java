package com.celiabilal.projectsport.services;

import com.celiabilal.projectsport.entities.User;
import com.celiabilal.projectsport.repositories.UserRepositoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepositoryBean userRepository;

    @Autowired
    public UserService(UserRepositoryBean userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> getAllUser() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
