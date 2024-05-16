package food.service;

import java.util.List;

import org.hibernate.Session;

import food.dao.FoodDAO;
import food.dao.FoodDAOImpl;
import food.entity.Food;
import food.util.HibernateUtil;

public class FoodServiceImpl implements FoodDAO {

	private FoodDAO dao;

	public FoodServiceImpl() {
		dao = new FoodDAOImpl();
	}

	@Override
	public Food findByPrimaryKey(Integer foodId) {

		return dao.findByPrimaryKey(foodId);
	}

	@Override
	public List<Food> getAll() {
		return dao.getAll();
	}
}