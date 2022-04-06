package com.mbs.MovieBookingSystem.repository;

import com.mbs.MovieBookingSystem.entity.Shows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ShowsRepository extends JpaRepository<Shows,Long> {
}
