package dk.NotFound.neo4jdatabase.repository;

import dk.NotFound.neo4jdatabase.model.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {

    @Query("MATCH (m:Movie) return m")
    Collection<Movie> getAllMovies();

    @Query("MATCH (u:User {name: \"$name\"})\n" +
            "MATCH (m:Movie {title: \"$title\"})\n" +
            "CREATE (u)-[:RATED {rating: $rating}]->(m)\n" +
            "RETURN u, m")
    Movie rateMovie(@Param("name") String name, @Param("title") String title, @Param("rating") Integer rating);

    //TODO: If we had directors in our database this is where we would make the query to link them with their movies.
}
