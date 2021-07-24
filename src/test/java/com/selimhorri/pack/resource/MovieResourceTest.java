package com.selimhorri.pack.resource;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.selimhorri.pack.constant.BackendApiUrl;
import com.selimhorri.pack.model.Movie;
import com.selimhorri.pack.service.MovieService;

@WebMvcTest(controllers = MovieResource.class)
class MovieResourceTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private MovieService movieService;
	
	@Autowired
	private ObjectMapper objectMapper;

	@BeforeEach
	void setUp() {
		final Movie movie = new Movie(1, "Interstellar", 8.6, "Christopher Nolan");
		Mockito.when(this.movieService.findByTitleIgnoreCase("Interstellar")).thenReturn(movie);
	}

	@Test
	void testFindByTitleIgnoreCase() throws Exception {
		
		final Movie outputMovie = new Movie(1, "Interstellar", 8.6, "Christopher Nolan");
		
		this.mockMvc.perform(
			MockMvcRequestBuilders.get(BackendApiUrl.BackendMovieApiUrl.MOVIE_API_URL + "/title/Interstellar")
				// .accept(MediaType.APPLICATION_JSON)
				.contentType(MediaType.APPLICATION_JSON)
				// .content(this.objectMapper.writeValueAsString(null))
		).andExpect(MockMvcResultMatchers
				.status().isOk());
	}
	
	
	
}
