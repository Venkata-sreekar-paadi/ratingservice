package com.tbs.ratingservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tbs.ratingservice.entity.Ratings;
import com.tbs.ratingservice.repository.RatingRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RatingServiceImpl implements RatingService {
	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Ratings createRating(Ratings ratings) {
		return ratingRepository.save(ratings);
	}

	@Override
	public List<Ratings> getRatings() {
		return ratingRepository.findAll() ;
	}

	@Override
	public List<Ratings> getRatingsByUserId(Integer UserId) {
		return ratingRepository.findByUserId(UserId);
	}

	@Override
	public List<Ratings> getRatingsByHotelId(Integer HotelId) {
		return ratingRepository.findByHotelId(HotelId);
	}

}
