package com.mbs.Multiplex_Booking_System.repository;

import com.mbs.Multiplex_Booking_System.entity.Shows;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowsRepository extends JpaRepository<Shows,Long> {
}
