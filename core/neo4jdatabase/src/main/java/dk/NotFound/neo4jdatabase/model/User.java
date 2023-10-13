package dk.NotFound.neo4jdatabase.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class User {

    @Id
    private Long id;
    private String name;
    private String address;
    @Relationship(type = "RATED")
    private Movie movie;

    public User() {
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public Movie getMovie() {
        return movie;
    }
}
