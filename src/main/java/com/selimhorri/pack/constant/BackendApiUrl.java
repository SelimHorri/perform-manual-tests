package com.selimhorri.pack.constant;

public abstract class BackendApiUrl {
	
	private static final String BASE_API_URL = "/app/api";
	
	private BackendApiUrl() {
		
	}
	
	public interface BackendMovieApiUrl {
		public static final String MOVIE_API_URL = BASE_API_URL + "/movies";
	}
	
	
	
}
