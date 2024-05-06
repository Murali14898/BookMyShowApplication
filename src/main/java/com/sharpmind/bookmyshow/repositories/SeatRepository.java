package com.sharpmind.bookmyshow.repositories;

import com.sharpmind.bookmyshow.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {

    List<Seat> findAllByIdIn(List<Integer> seatIds);
}
