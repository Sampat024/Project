package com.mbs.MovieBookingSystem.repository;

import com.mbs.MovieBookingSystem.entity.Hall;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HallRepository extends JpaRepository<Hall,Long> {
}
