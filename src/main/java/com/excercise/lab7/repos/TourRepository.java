package com.excercise.lab7.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excercise.lab7.entity.Tour;

public interface TourRepository extends JpaRepository<Tour, Long> {

}
