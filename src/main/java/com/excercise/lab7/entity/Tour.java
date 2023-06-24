package com.excercise.lab7.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author MyPC
 *
 */
@Entity(name = "tour")
public class Tour {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	// my add
	@Column(name = "title")
	private String title;
	@Column(name = "description")

	private String description;
	@Column(name = "days")

	private String days;
	@Column(name = "transportation")
	private String transportation;
	@Column(name = "departure_schedule")
	private String departureSchedule;
	@Column(name = "price")
	private double price;

	public Tour() {
		// TODO Auto-generated constructor stub
	}

	public Tour(long id, String title, String description, String days, String transportation, String departureSchedule,
			double price) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.days = days;
		this.transportation = transportation;
		this.departureSchedule = departureSchedule;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getTransportation() {
		return transportation;
	}

	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}

	public String getDepartureSchedule() {
		return departureSchedule;
	}

	public void setDepartureSchedule(String departureSchedule) {
		this.departureSchedule = departureSchedule;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Tour [id=" + id + ", title=" + title + ", description=" + description + ", days=" + days
				+ ", transportation=" + transportation + ", departureSchedule=" + departureSchedule + ", price=" + price
				+ "]";
	}

}
