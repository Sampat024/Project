package com.mbs.MovieBookingSystem.repository;

import com.mbs.MovieBookingSystem.entity.SeatType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SeatTypeRepository extends JpaRepository<SeatType,Long> {
}
