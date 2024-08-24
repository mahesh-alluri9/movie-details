package com.mb.moviedetail.controller;

import com.mb.moviedetail.beans.MovieDetails;
import com.mb.moviedetail.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<MovieDetails> getMovieDetails(){
        return movieService.movieDetailsList();
    }
}
