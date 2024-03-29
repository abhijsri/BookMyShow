package com.moveinsynch.bms.BookMyShow.repositories;

import com.moveinsynch.bms.BookMyShow.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer> {
    @Query("SELECT u FROM User u WHERE u.username=:username")
    Iterable<User> findUserByUsername(@Param("username") String u);

    @Query("SELECT u FROM User u WHERE u.username=:username AND u.password=:password")
    Iterable<User> findUserByCredentials(@Param("username") String username, @Param("password") String password);
}
