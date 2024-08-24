package com.mb.moviedetail.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDetails {

    private String movieName;
    private String hero;
    private String musicDirector;
}
