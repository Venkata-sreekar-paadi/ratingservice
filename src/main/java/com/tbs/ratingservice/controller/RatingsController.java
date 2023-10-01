package com.tbs.ratingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tbs.ratingservice.entity.Ratings;
import com.tbs.ratingservice.service.RatingService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/RatingsService")
@RequiredArgsConstructor
public class RatingsController {
	
	@Autowired
	private RatingService ratingService;
	
	@PostMapping("/createRatings")
	public ResponseEntity<Ratings> createRatings(@RequestBody Ratings ratings){
		Ratings savedRatings=ratingService.createRating(ratings);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedRatings);
	}
	
	@GetMapping("/getRatings")
	public ResponseEntity<List<Ratings>> getAllRatings(){
		List<Ratings> ratings=ratingService.getRatings();
		return ResponseEntity.ok(ratings);
	}
	
	@GetMapping("/getRatingsByUserId/{userId}")
	public ResponseEntity<List<Ratings>> getRatingsByUserId(@PathVariable Integer userId){
		List<Ratings> ratings=ratingService.getRatingsByUserId(userId);
		return ResponseEntity.ok(ratings);
	}
	
	@GetMapping("/getRatingsByHotelId/{hotelId}")
	public ResponseEntity<List<Ratings>> getRatingsByHotelId(@PathVariable Integer hotelId){
		List<Ratings> ratings=ratingService.getRatingsByHotelId(hotelId);
		return ResponseEntity.ok(ratings);
	}
	
	

}
