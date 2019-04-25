package service;

import model.User;


public interface UserService {

    User selectUser(long userId);

    int insert(User user);

}
