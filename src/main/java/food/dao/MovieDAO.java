package food.dao;

import java.util.List;

import food.entity.Movie;

public interface MovieDAO {
	
	public List<Movie> getAll();

	public Movie getByMovieId(Integer movieId);
	
}