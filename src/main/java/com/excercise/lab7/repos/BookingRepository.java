package com.excercise.lab7.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excercise.lab7.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
