package dao;

import model.User;

public interface UserDao {
    User selectUser(long id);
}