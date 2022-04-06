package com.mbs.MovieBookingSystem.repository;

import com.mbs.MovieBookingSystem.entity.BookingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BookingDetailRepository extends JpaRepository<BookingDetail,Long> {
}
