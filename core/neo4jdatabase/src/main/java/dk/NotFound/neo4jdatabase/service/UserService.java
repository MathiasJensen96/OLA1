package dk.NotFound.neo4jdatabase.service;

import dk.NotFound.neo4jdatabase.model.User;
import dk.NotFound.neo4jdatabase.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public Collection<User> getAll() {
        return userRepository.getAllUsers();
    }
}
