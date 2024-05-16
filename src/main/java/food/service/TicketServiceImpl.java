package food.service;

import java.util.List;

import org.hibernate.Session;

import food.dao.MovieDAO;
import food.dao.TicketDAO;
import food.entity.Ticket;
import food.util.HibernateUtil;

public class TicketServiceImpl implements TicketDAO {

	private TicketDAO dao;

	@Override
	public List<Ticket> getAll() {

		return dao.getAll();

	}
}
