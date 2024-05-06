package com.sharpmind.bookmyshow.repositories;

import com.sharpmind.bookmyshow.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {
    Optional<Show> findById(int showId);
}
