package com.gigglegig.service.impl;

import com.gigglegig.model.User;
import com.gigglegig.model.response.Response;
import com.gigglegig.service.IUserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public List<User> searchUsers(String query) {
        return List.of();
    }

    @Override
    public Response updateUser(User user) {
        return null;
    }

    @Override
    public Response deactivateUser(Long userId) {
        return null;
    }

    @Override
    public Response activateUser(Long userId) {
        return null;
    }
}
