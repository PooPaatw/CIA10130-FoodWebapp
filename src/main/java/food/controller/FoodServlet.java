package food.controller;


import java.io.IOException;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import food.entity.*;
import food.service.*;


@WebServlet("/food/food.do")
public class FoodServlet extends HttpServlet {
	private FoodService foodService;
	
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
	        List<Food> foodList = foodService.getAll(new ArrayList<Food>());

	        req.setAttribute("foodList", foodList);

	        return "/food/orderticket.jsp";
	    } catch (Exception e) {
	        e.printStackTrace(); 
	        return "/error.jsp"; 
	    }
	}


}
