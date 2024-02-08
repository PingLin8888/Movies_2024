package dev.phoebe.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//talking to the database and get the data back.
@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}
