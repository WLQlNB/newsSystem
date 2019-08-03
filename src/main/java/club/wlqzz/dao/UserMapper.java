package club.wlqzz.dao;

import club.wlqzz.pojo.User;

import java.util.List;

public interface UserMapper {
    void addUser(User user);
    User getUserById(String id);
    void updateUser(User user);
    void deleteUser(User user);
    List<User> getAllUsers();
}
