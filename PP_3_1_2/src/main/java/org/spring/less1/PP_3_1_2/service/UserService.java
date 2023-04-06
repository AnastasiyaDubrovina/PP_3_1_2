package org.spring.less1.PP_3_1_2.service;


import org.spring.less1.PP_3_1_2.model.User;

import java.util.List;

public interface UserService {

    void saveUser(User user);

    void removeUserById(Long id);

    void updateUserById(Long id, User user);

    User showById(Long id);

    List<User> getAllUsers();
}
