package com.moveinsynch.bms.BookMyShow.repositories;

import com.moveinsynch.bms.BookMyShow.models.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AdminRepository extends CrudRepository<Admin, Integer> {
    @Query("SELECT u FROM Admin u WHERE u.username=:username")
    Iterable<Admin> findAdminByUsername(@Param("username") String u);

    @Query("SELECT u FROM Admin u WHERE u.username=:username AND u.password=:password")
    Iterable<Admin> findAdminByCredentials(@Param("username") String username, @Param("password") String password);
}
