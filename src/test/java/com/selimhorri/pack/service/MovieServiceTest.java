package com.selimhorri.pack.service;

import static org.assertj.core.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.selimhorri.pack.model.Movie;
import com.selimhorri.pack.repo.MovieRepository;

@SpringBootTest
class MovieServiceTest {
	
	@Autowired
	private MovieService movieService;
	
	@MockBean
	private MovieRepository movieRepository;
	
	@BeforeEach
	void setUp() {
		Optional<Movie> movieOptional = Optional.of(new Movie(1, "Interstellar", 8.6, "Christopher Nolan"));
		Mockito.when(this.movieRepository.findByTitleIgnoreCase("Interstellar")).thenReturn(movieOptional);
	}
	
	@Test
	@DisplayName("test if the mocked object returns the object as expected")
	void testFindByTitleIgnoreCase() {
		final Movie expectedMovie = new Movie(1, "Interstellar", 8.6, "Christopher Nolan");
		final Movie actualMovie = this.movieService.findByTitleIgnoreCase("Interstellar");
		
		assertThat(expectedMovie)
			.isEqualTo(actualMovie);
	}
	
	
	
}
