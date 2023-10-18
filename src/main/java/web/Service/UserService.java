package web.Service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();

    void addUser(User user);

    void updateUser(User user);

    void removeUser(int id);

    User getUserById(int id);
}
