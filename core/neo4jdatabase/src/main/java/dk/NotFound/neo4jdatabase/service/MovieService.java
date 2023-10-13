package dk.NotFound.neo4jdatabase.service;

import dk.NotFound.neo4jdatabase.model.Movie;
import dk.NotFound.neo4jdatabase.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public Collection<Movie> getAll() {
        return movieRepository.getAllMovies();
    }

    public Movie rateMovie(String name, String title, Integer rating) {
        return movieRepository.rateMovie(name, title, rating);
    }
}
