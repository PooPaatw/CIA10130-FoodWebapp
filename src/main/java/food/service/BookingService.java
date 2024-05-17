package food.service;

import food.dao.ShowtimeInfoDAO;
import food.dao.ShowtimeInfoDAOImpl;
import food.entity.ShowtimeInfo;

public class BookingService {

		private ShowtimeInfoDAO dao;
		
		public BookingService() {
			dao = new ShowtimeInfoDAOImpl();
		}

		public String findRightScreenId(Integer showId) {
			ShowtimeInfo show = dao.getshowtimeId(showId);
			String screenId=show.getScreen().getScreenId();
			
			String url="";
			switch (screenId) {
			case "A廳":
				url="/back_end/screen/screen1.jsp";
				return url;
				
			case "B廳":
				url="/back_end/screen/screen2.jsp";
				return url;
				
			case "C廳":
				url="/back_end/screen/screen3.jsp";
				return url;
				
			case "D廳":
				url="/back_end/screen/screen4.jsp";
				return url;
			}
			
			return screenId;
		}
		
	}

