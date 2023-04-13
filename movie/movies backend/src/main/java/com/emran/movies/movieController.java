package com.emran.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/m/movies")

public class movieController {
    @Autowired
    private service service;
    @GetMapping
    @CrossOrigin(origins = "*")

    public ResponseEntity<List<movie>> getallmovies(){
        return new ResponseEntity<List<movie>>(service.allmovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbid}")
    public ResponseEntity<Optional<movie>> getallmovies(@PathVariable String imdbid){
        return new ResponseEntity<Optional<movie>>(service.singlemoviebyId(imdbid), HttpStatus.OK);
    }


}
