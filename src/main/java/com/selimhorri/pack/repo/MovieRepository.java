package com.selimhorri.pack.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.selimhorri.pack.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
}
