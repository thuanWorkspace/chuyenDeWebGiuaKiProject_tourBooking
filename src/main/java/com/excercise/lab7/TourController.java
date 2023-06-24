package com.excercise.lab7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.excercise.lab7.entity.Booking;
import com.excercise.lab7.entity.Customer;
import com.excercise.lab7.entity.Tour;

@Controller
public class TourController {
	@Autowired
	TourService tourService;

	@GetMapping("/listTours")
	public String listToursPage(Model model) {
		model.addAttribute("tours", tourService.getAllTours());
		return "listTours";
	}

	@GetMapping("/tourDetail")
	public String tourDetailPage(@RequestParam Long id, Model model) {
		model.addAttribute("tour", tourService.getTour(id));
		return "tourDetail";
	}

	@GetMapping("/bookingTour")
	public String bookingTourPage(@RequestParam Long id, Model model) {
		model.addAttribute("tour", tourService.getTour(id));
		model.addAttribute("booking", new Booking());
		model.addAttribute("customer", new Customer());
		
		return "bookingTour";
	}

	// book move all data to confirm
	@PostMapping("/bookingTour")
	public String bookingTour(@RequestParam Long id, Booking booking, Customer customer, Model model) {
		model.addAttribute("tour", tourService.getTour(id));
		model.addAttribute("booking", booking);
		model.addAttribute("customer", customer);
		System.out.println(booking.getDepartureDate());
		System.out.println(booking.getNoAdults());
		return "confirm";
	}

	@PostMapping("/confirm")
	public String confirm(@RequestParam Long id, Booking booking, Customer customer, Model model) {
		Tour tour = tourService.getTour(id);
		booking.setTour(tour);
		tourService.saveCustomer(customer);
		
		booking.setCustomer(customer);
		tourService.saveBooking(booking);
//		tourService.saveCustomer(customer);
		model.addAttribute("customer", customer);
		model.addAttribute("tour", tour);
		model.addAttribute("booking", booking);
		return "confirmSuccess";
	}
}
