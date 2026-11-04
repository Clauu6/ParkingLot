package org.parkinglot.parkinglot2.ejb;

import org.parkinglot.parkinglot2.common.UserDto;
import org.parkinglot.parkinglot2.entities.User;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class UsersBean {

    @PersistenceContext
    EntityManager entityManager;

    public List<UserDto> findAllUsers() {
        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u", User.class);
        List<User> users = query.getResultList();
        return copyUsersToDto(users);
    }

    private List<UserDto> copyUsersToDto(List<User> users) {
        List<UserDto> dtos = new ArrayList<>();
        for (User user : users) {
            dtos.add(new UserDto(user.getId(), user.getUsername(), user.getEmail()));
        }
        return dtos;
    }
}
