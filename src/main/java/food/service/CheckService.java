package food.service;
import java.util.List;


import food.dao.ScreenDAO;
import food.dao.ScreenDAOImpl;

import food.entity.Screen;


public class CheckService {

		private ScreenDAO dao;
		
		public CheckService() {
			dao = new ScreenDAOImpl();
		}

		
		
	}

