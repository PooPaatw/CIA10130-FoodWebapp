package food.service;

import java.util.List;


import org.hibernate.Session;

import food.dao.MovieDAO;
import food.dao.MovieDAOImpl;
import food.entity.Movie;
import food.util.HibernateUtil;

public class MovieServiceImpl implements MovieDAO {
	
	private MovieDAO dao;

	public MovieServiceImpl() {
		dao = new MovieDAOImpl();
	}
	
	@Override
	public Movie getByMovieId(Integer movieId) {
		
		return dao.getByMovieId(movieId);
			
	}
	
	@Override
	public List<Movie> getAll() {
		
		return dao.getAll();
		
	}

}
