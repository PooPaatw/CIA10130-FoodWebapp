package food.service;

import java.util.List;


import food.dao.FoodDAO;
import food.dao.FoodDAOImpl;
import food.entity.Food;

public class FoodService {
	private FoodDAO dao;
	
	public FoodService() {
		dao = new FoodDAOImpl();
	}

	public Food getOneFood(Integer foodId) {
		return dao.findByPrimaryKey(foodId);
	}

	public List<Food> getAll(List<Food> foodList) {
		return dao.getAll();
	}	
	
}
