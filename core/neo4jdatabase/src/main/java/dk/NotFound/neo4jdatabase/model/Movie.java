package dk.NotFound.neo4jdatabase.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.util.List;

@Node
public class Movie {

    @Id
    private Long id;
    private String title;
    private String director;
    private Integer yearReleased;
    private List<String> genre;

    public Movie() {
    }

    public Movie(Long id, String name, String director, Integer yearReleased, List<String> genre) {
        this.id = id;
        this.title = name;
        this.director = director;
        this.yearReleased = yearReleased;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public Integer getYearReleased() {
        return yearReleased;
    }

    public List<String> getGenre() {
        return genre;
    }
}
