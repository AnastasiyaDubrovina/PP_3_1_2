package org.spring.less1.PP_3_1_2.dao;


import org.spring.less1.PP_3_1_2.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    User showById(Long id);

    void updateUserById(Long id, User user);

    void removeUserById(Long id);

    List<User> getAllUsers();

}
