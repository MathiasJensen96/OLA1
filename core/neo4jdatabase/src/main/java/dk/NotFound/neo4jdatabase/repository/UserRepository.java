package dk.NotFound.neo4jdatabase.repository;

import dk.NotFound.neo4jdatabase.model.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;

public interface UserRepository extends Neo4jRepository<User, Long> {

    @Query("MATCH (u:User) return u")
    Collection<User> getAllUsers();
}
