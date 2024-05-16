package food.dao;

import java.util.List;

import food.entity.ShowtimeInfo;

public interface ShowtimeInfoDAO {
	
    public ShowtimeInfo getshowtimeId(Integer showtimeId);
    
	public List<ShowtimeInfo> getAll();

}