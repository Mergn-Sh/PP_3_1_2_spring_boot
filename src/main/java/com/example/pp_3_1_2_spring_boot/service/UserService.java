package com.example.pp_3_1_2_spring_boot.service;
import com.example.pp_3_1_2_spring_boot.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(User user);

    User getUser(int id);

    void deleteUser(int id);
}
