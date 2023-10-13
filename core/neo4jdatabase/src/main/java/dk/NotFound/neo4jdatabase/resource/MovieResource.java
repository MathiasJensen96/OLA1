package dk.NotFound.neo4jdatabase.resource;

import dk.NotFound.neo4jdatabase.model.Movie;
import dk.NotFound.neo4jdatabase.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/movie")
public class MovieResource {

    @Autowired
    MovieService movieService;

    @GetMapping
    public Collection<Movie> getAll() {
        return movieService.getAll();
    }

    @PostMapping("/rate")
    public Movie rateMovie(@RequestParam String name, @RequestParam String title, @RequestParam Integer rating) {
        return movieService.rateMovie(name, title, rating);
    }
}
