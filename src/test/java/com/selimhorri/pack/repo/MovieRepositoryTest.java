package com.selimhorri.pack.repo;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.selimhorri.pack.model.Movie;

@DataJpaTest
class MovieRepositoryTest {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private TestEntityManager testEntityManager;
	
	@BeforeEach
	void setUp() throws Exception {
		final Movie movie = 
				Movie.builder()
					.title("Memento")
					.imdbRating(7.7)
					.director("Christopher Nolan")
					.build();
		this.testEntityManager.persist(movie);
	}
	
	@Test
	@DisplayName("test if the repo returns the expected object")
	void testFindByTitleIgnoreCase() {
		final Movie movie = this.movieRepository.findByTitleIgnoreCase("Memento").get();
		
		assertThat("Memento")
			.isEqualTo(movie.getTitle());
	}
	
	
	
}
