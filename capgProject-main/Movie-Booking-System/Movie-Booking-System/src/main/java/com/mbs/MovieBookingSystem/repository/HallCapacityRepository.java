package com.mbs.MovieBookingSystem.repository;

import com.mbs.MovieBookingSystem.entity.HallCapacity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HallCapacityRepository extends JpaRepository<HallCapacity,Long> {
}
