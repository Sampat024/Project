package com.mbs.Multiplex_Booking_System.repository;

import com.mbs.Multiplex_Booking_System.entity.HallCapacity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallCapacityRepository extends JpaRepository<HallCapacity,Long> {
}
