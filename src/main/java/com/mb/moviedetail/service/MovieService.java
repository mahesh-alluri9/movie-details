package com.mb.moviedetail.service;

import com.mb.moviedetail.beans.MovieDetails;
import com.mb.moviedetail.controller.MovieController;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    List<MovieDetails> movieDetails = new ArrayList<>();

    public List<MovieDetails> movieDetailsList(){
        movieDetails.add(new MovieDetails("Pokiri", "Mahesh Babu", "Mani Sharma"));
        movieDetails.add(new MovieDetails("Devara", "NTR", "Anirudh"));
        return movieDetails;
    }
}
