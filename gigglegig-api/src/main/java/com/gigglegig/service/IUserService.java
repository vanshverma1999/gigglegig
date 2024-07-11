package com.gigglegig.service;

import com.gigglegig.model.User;
import com.gigglegig.model.response.Response;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();
    List<User> searchUsers(String query);
    Response updateUser(User user);
    Response deactivateUser(Long userId);
    Response activateUser(Long userId);
}
