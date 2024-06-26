package food.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import food.entity.Ticket;
import food.util.HibernateUtil;

public class TicketDAOImpl implements TicketDAO {

	private SessionFactory factory;

	public TicketDAOImpl() {
		factory = HibernateUtil.getSessionFactory();
	}

	private Session getSession() {
		return factory.getCurrentSession();
	}

	@Override
	public List<Ticket> getAll() {

		List<Ticket> list = getSession().createQuery("FROM Ticket", Ticket.class).list();

		return list;
	}

}
