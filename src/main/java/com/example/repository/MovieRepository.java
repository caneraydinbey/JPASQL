package com.example.repository;

/**
 * Created by caneraydin on 10.03.2016.
 */

import com.example.domain.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {

    Page<Movie> findAll(Pageable pageable);
}