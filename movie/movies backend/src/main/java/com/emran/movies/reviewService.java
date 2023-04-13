package com.emran.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class reviewService {
    @Autowired
    private reviewRepository reviewRepository;
    @Autowired
    private MongoTemplate MongoTemplate;
    public review createReview(String body,String imdbId){
        review review=reviewRepository.insert(new review(body));

        MongoTemplate.update(movie.class)
                .matching(Criteria.where("imdbId" ).is(imdbId))
                .apply(new Update().push("reviewIds").value(review)).first();

        return review;
    }
}
