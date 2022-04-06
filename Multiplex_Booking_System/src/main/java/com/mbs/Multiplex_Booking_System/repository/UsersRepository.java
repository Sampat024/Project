package com.mbs.Multiplex_Booking_System.repository;

import com.mbs.Multiplex_Booking_System.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
}
