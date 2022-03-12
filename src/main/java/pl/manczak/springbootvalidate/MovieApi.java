package pl.manczak.springbootvalidate;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/movies")
public class MovieApi {

    private List<Movie> movieList;

    public MovieApi() {
        this.movieList = new ArrayList<>();

    }

    @GetMapping
    public List<Movie> getMovies() {
        return movieList;
    }

    @PostMapping
    public boolean addMovie(@Validated @RequestBody Movie movie) {
        return movieList.add(movie);
    }
}
