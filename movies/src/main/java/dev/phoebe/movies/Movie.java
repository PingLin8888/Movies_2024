package dev.phoebe.movies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

// let the framework know that this class should present each document in the movie collection.
@Document(collection = "movies")
@Data //take care of getter, setter and two String methods
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    @Id// framework identifies the unique id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdorps;
    //Cause the database only to store the ids of the review and the reviews will be in a seperate collection.
    //Manual reference relationship
    @DocumentReference
    private List<Review> reviewsIds;
}
