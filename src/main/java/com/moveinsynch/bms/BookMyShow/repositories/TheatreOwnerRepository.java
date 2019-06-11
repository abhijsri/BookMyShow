package com.moveinsynch.bms.BookMyShow.repositories;

import com.moveinsynch.bms.BookMyShow.models.TheatreOwner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TheatreOwnerRepository extends CrudRepository<TheatreOwner, Integer> {
    @Query("SELECT u FROM TheatreOwner u WHERE u.username=:username")
    Iterable<TheatreOwner> findTheatreOwnerByUsername(@Param("username") String u);

    @Query("SELECT u FROM TheatreOwner u WHERE u.username=:username AND u.password=:password")
    Iterable<TheatreOwner> findTheatreOwnerByCredentials(@Param("username") String username, @Param("password") String password);
}
