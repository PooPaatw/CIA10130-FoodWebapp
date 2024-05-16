package food.service;



import java.util.List;

import food.dao.MovieDAO;
import food.dao.MovieDAOImpl;
import food.entity.Movie;

public class MovieService {
	private MovieDAO dao;
	
	public MovieService() {
		dao = new MovieDAOImpl();
	}
	
	public Movie getOneMovie(Integer movieId) {
		return dao.getByMovieId(movieId);
	}
	
	public List<Movie> getAll(List<Movie> movieList) {
		return dao.getAll();
	}
}