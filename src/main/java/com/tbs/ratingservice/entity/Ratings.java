package com.tbs.ratingservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Rating_Microservices")
public class Ratings {
	@Id
	@Column(name = "Rating_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ratingId;
	@Column(name = "User_Id")
	private Integer userId;
	@Column(name = "Hotel_Id")
	private Integer hotelId;
	@Column(name = "Rating")
	private Integer rating;
	@Column(name = "Feedback")
	private String feedback;
}
