package food.dao;

import java.util.List;


import food.entity.Food;

public interface FoodDAO {
	
    public Food findByPrimaryKey(Integer foodId);
    
	public List<Food> getAll();

}