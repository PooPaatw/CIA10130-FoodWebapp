package food.controller;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import food.entity.Movie;
import food.service.MovieService;

@WebServlet("/food/movie.do")
public class MovieServlet extends HttpServlet {
	private MovieService movieService;
	
	@Override
	public void init() throws ServletException {
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doPost(req, res);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
	
	private String getAll(HttpServletRequest req, HttpServletResponse res) {
	    try {
	        List<Movie> movieList = movieService.getAll(new ArrayList<Movie>());

	        req.setAttribute("movieList", movieList);

	        return "/food/index.jsp";
	    } catch (Exception e) {
	        e.printStackTrace(); 
	        return "/error.jsp"; 
	    }
	}


}
