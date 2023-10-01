package com.tbs.ratingservice.service;

import java.util.List;

import com.tbs.ratingservice.entity.Ratings;

public interface RatingService {
	
	Ratings createRating(Ratings ratings);
	
	List<Ratings> getRatings();
	
	List<Ratings>getRatingsByUserId(Integer UserId);
	
	List<Ratings>getRatingsByHotelId(Integer HotelId);
	
	
	

}
