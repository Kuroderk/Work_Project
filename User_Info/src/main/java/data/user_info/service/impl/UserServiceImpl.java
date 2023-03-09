package data.user_info.service.impl;

import data.user_info.model.User;
import data.user_info.repository.UserRepository;
import data.user_info.service.UserService;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
