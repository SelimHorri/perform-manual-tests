package com.selimhorri.pack.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.selimhorri.pack.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	Optional<Movie> findByTitleIgnoreCase(final String title);
	
}
