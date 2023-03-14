package sashko.servicesapp.bookly.service;

import sashko.servicesapp.bookly.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUser(String userName);
}
