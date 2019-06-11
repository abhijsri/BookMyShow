package com.moveinsynch.bms.BookMyShow.repositories;

import com.moveinsynch.bms.BookMyShow.models.MovieTicket;
import org.springframework.data.repository.CrudRepository;

public interface MovieTicketRepository extends CrudRepository<MovieTicket, Integer> {
}
