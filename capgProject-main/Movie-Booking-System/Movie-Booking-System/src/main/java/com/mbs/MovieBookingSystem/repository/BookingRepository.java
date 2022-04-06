package com.mbs.MovieBookingSystem.repository;

import com.mbs.MovieBookingSystem.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
