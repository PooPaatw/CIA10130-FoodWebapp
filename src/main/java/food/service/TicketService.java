package food.service;

import java.util.List;


import javax.transaction.Transactional;
import food.dao.TicketDAOImpl;
import food.entity.Ticket;
import food.util.HibernateUtil;

@Transactional
public class TicketService {

	private TicketDAOImpl dao;

	public TicketService() {
		dao = new TicketDAOImpl();
	}
	//查詢全部票種
	public List<Ticket> getAll(List<Ticket> ticket) {
		return dao.getAll();
	}


}
