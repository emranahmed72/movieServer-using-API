package com.emran.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface movieRepository extends MongoRepository<movie, ObjectId> {

   Optional<movie> findMovieByImdbId(String imdbId);


}
