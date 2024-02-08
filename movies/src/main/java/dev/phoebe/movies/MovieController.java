package dev.phoebe.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

//Annotation. Let java compiler knows about what the class does.
//Let the framework know that this class is actually a REST API controller not other class.
/*A REST API controller is a component in a software application that handles incoming HTTP
requests and provides responses according to the principles of Representational State Transfer (REST)*/
@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    //initiate movieService
    @Autowired
    private MovieService movieService;
    //Let the framework know that this method allMovie is a get endpoint.
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId) {
        return new ResponseEntity<>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}
