package com.excercise.lab7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excercise.lab7.entity.Booking;
import com.excercise.lab7.entity.Customer;
import com.excercise.lab7.entity.Tour;
import com.excercise.lab7.repos.BookingRepository;
import com.excercise.lab7.repos.CustomerRepository;
import com.excercise.lab7.repos.TourRepository;

@Service
public class TourService {
	@Autowired
	TourRepository tourRepository;
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	BookingRepository bookingRepository;

	public List<Tour> getAllTours() {
		return tourRepository.findAll();
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
//		return null;
	}

	public Tour getTour(long id) {
		return tourRepository.findById(id).get();
	}

	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
//		return null;
	}

	public Booking saveBooking(Booking booking) {
		return bookingRepository.save(booking);
	}
}
