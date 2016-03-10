package com.example.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.domain.Movie;
import com.example.repository.MovieRepository;

/**
 * Created by caneraydin on 10.03.2016.
 */
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping("/")
    @ResponseBody
    public String test() {
        Movie movie = new Movie();
        movie.setActors("kadir inanir");
        movie.setTitle("selviboylum");
        movieRepository.save(movie);
        System.out.println("***\n\n****");System.out.println("***\n\n****");System.out.println("***\n\n****");
        for (Movie m : movieRepository.findAll()) {
            System.out.println(m.toString());
        }
        System.out.println("***\n\n****");System.out.println("***\n\n****");System.out.println("***\n\n****");
        return "hello";
    }
}
