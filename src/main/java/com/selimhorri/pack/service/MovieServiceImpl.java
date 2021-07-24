package com.selimhorri.pack.service;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.selimhorri.pack.model.Movie;
import com.selimhorri.pack.repo.MovieRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class MovieServiceImpl implements MovieService {
	
	private final MovieRepository movieRepository;
	
	@Override
	public List<Movie> findAll() {
		return Collections.unmodifiableList(this.movieRepository.findAll());
	}
	
	@Override
	public Movie findById(Integer movieId) {
		return this.movieRepository.findById(movieId).orElseThrow(NoSuchElementException::new);
	}
	
	@Override
	public Movie save(Movie movie) {
		return this.movieRepository.save(movie);
	}
	
	@Override
	public Movie update(Movie movie) {
		return this.movieRepository.save(movie);
	}
	
	@Override
	public void deleteById(Integer movieId) {
		this.movieRepository.delete(this.findById(movieId));
	}

	@Override
	public Movie findByTitleIgnoreCase(final String title) {
		return this.movieRepository.findByTitleIgnoreCase(title).orElseThrow(NoSuchElementException::new);
	}
	
	
	
}
