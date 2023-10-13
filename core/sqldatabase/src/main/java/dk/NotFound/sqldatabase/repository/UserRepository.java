package dk.NotFound.sqldatabase.repository;

import dk.NotFound.sqldatabase.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = "SELECT * FROM OLA1.user", nativeQuery = true)
    List<User> getUsers();
}
