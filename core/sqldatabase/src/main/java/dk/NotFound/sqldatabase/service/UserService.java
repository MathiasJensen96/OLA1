package dk.NotFound.sqldatabase.service;

import dk.NotFound.sqldatabase.entity.User;
import dk.NotFound.sqldatabase.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> GetAllUsers() {
        return userRepository.getUsers();
    }
}
