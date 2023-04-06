package org.spring.less1.PP_3_1_2.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.spring.less1.PP_3_1_2.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public void saveUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void updateUserById(Long id, User user) {
        User userToBeUpdated = showById(id);
        userToBeUpdated.setName(user.getName());
        userToBeUpdated.setAge(user.getAge());
        entityManager.merge(userToBeUpdated);
    }

    @Override
    public User showById(Long id) {
        return entityManager.find(User.class, id);

    }

    @Override
    public void removeUserById(Long id) {
        entityManager.remove(entityManager.find(User.class, id));

    }


    @Override
    @SuppressWarnings("unchecked")
    public List<User> getAllUsers() {
        return entityManager.createQuery(
                "select u from User u", User.class).getResultList();
    }
}
