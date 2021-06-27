package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserService {

    private List<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
    }

    public User getByLogin(String login){
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        return null;
    }
}
