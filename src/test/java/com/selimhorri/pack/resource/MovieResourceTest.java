package com.selimhorri.pack.resource;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.selimhorri.pack.service.MovieService;

class MovieResourceTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private MovieService movieService;
	
	@BeforeEach
	void setUp() {
		
	}
	
	@Test
	void testFindByTitleIgnoreCase() {
		
	}
	
	
	
}
