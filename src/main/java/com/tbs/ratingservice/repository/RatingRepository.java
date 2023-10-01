package com.tbs.ratingservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tbs.ratingservice.entity.Ratings;

@Repository
public interface RatingRepository extends JpaRepository<Ratings, Integer> {
	
	List<Ratings>findByUserId(Integer UserId);
	List<Ratings>findByHotelId(Integer HotelId);

}
