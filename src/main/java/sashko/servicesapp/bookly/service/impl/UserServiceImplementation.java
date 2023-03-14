package sashko.servicesapp.bookly.service.impl;

import org.springframework.stereotype.Service;
import sashko.servicesapp.bookly.exceptions.EntityNotFoundException;
import sashko.servicesapp.bookly.model.User;
import sashko.servicesapp.bookly.repository.UserRepository;
import sashko.servicesapp.bookly.service.UserService;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userName) {
        return userRepository.findById(userName)
                .orElseThrow(() -> new EntityNotFoundException(User.class, userName));
    }
}
