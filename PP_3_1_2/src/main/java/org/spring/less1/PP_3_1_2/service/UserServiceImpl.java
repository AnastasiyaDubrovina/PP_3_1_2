package org.spring.less1.PP_3_1_2.service;

import org.spring.less1.PP_3_1_2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.spring.less1.PP_3_1_2.dao.UserDao;

import javax.transaction.Transactional;
import java.util.List;

@Service
@jakarta.transaction.Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    @Transactional
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }
    @Transactional
    @Override
    public void removeUserById(Long id) {
        userDao.removeUserById(id);
    }

    @Transactional
    @Override
    public void updateUserById(Long id, User user) {
        userDao.updateUserById(id, user);
    }

    @Transactional
    @Override
    public User showById(Long id) {
        return userDao.showById(id);

    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
