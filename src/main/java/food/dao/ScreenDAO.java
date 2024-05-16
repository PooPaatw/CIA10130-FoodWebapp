package food.dao;

import java.util.List;

import food.entity.Screen;

public interface ScreenDAO {
	
    public Screen findByPrimaryKey(Integer screenId);
    
	public List<Screen> getAll();

}