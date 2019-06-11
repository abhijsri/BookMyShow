package com.moveinsynch.bms.BookMyShow.repositories;

import com.moveinsynch.bms.BookMyShow.models.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
    @Query("SELECT m FROM Movie m WHERE m.title=:title")
    Iterable<Movie> findMovieByMovieName(@Param("title") String title);
}
