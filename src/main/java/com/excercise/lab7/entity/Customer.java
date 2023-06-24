package com.excercise.lab7.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(columnDefinition = "BIGINT")

	private long id;
//	@Column(name="cust_name",columnDefinition = "VARCHAR(255)")
	@NotBlank
	private String name;

//	@Column(columnDefinition = "VARCHAR(255)")
	private String address;
	@NotBlank
//	@Column(columnDefinition = "VARCHAR(255)")
	private String email;

//	@Column(columnDefinition = "VARCHAR(255)")
	private String phone;

	public Customer(long id, String name, String address, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", phone="
				+ phone + "]";
	}

}
