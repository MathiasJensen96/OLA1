package dk.NotFound.neo4jdatabase.resource;

import dk.NotFound.neo4jdatabase.model.User;
import dk.NotFound.neo4jdatabase.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/user")
public class UserResources {

    @Autowired
    UserService userService;

    @GetMapping
    public Collection<User> getAll() {
        return userService.getAll();
    }
}
