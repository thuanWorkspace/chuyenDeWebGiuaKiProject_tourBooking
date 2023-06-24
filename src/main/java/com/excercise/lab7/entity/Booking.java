package com.excercise.lab7.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity(name = "booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne
	private Customer customer;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date departureDate;
//	@NotBlank
//	@NotNull
	private int noAdults;
	private int noChilren;
	@ManyToOne
	private Tour tour;

	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

//	public Booking(long id, Customer customer, Date departureDate, int noAdults, int noChilren, Tour tour) {
//		super();
//		this.id = id;
//		this.customer = customer;
//		this.departureDate = departureDate;
//		this.noAdults = noAdults;
//		this.noChilren = noChilren;
//		this.tour = tour;
//	}

	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

//	public Customer1 getCustomer() {
//		return customer;
//	}
//	public void setCustomer(Customer1 customer) {
//		this.customer = customer;
//	}
	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public int getNoAdults() {
		return noAdults;
	}

	public void setNoAdults(int noAdults) {
		this.noAdults = noAdults;
	}

	public int getNoChilren() {
		return noChilren;
	}

	public void setNoChilren(int noChilren) {
		this.noChilren = noChilren;
	}

	public Tour getTour() {
		return tour;
	}

	public void setTour(Tour tour) {
		this.tour = tour;
	}
}
