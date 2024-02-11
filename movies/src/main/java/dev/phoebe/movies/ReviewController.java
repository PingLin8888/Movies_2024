package dev.phoebe.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> creatReview(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<>(reviewService.creatReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }

}
