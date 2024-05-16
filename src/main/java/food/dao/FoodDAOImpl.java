package food.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import food.entity.Food;
import food.util.HibernateUtil;

public class FoodDAOImpl implements FoodDAO {

	// SessionFactory 為 thread-safe，可宣告為屬性讓請求執行緒們共用
	private SessionFactory factory;

	public FoodDAOImpl() {
		factory = HibernateUtil.getSessionFactory();
	}

	// Session 為 not thread-safe，所以此方法在各個增刪改查方法裡呼叫
	// 以避免請求執行緒共用了同個 Session
	private Session getSession() {
		return factory.getCurrentSession();
	}

	@Override
	public List<Food> getAll() {

		List<Food> list = getSession().createQuery("FROM Food", Food.class).list();

		return list;

	}

//	@Override
//	public Food findByPrimaryKey(Integer foodId) {
//		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//		Food food = null;
//		try {
//			session.beginTransaction();
//			food = session.get(Food.class, foodId);
//			session.getTransaction().commit();
//			return food;
//		} catch (Exception e) {
//			e.printStackTrace();
//			session.getTransaction().rollback();
//		}
//		return null;
//	}

	@Override
	public Food findByPrimaryKey(Integer foodId) {

		return getSession().get(Food.class, foodId);

	}

	public static void main(String[] args) {
		FoodDAOImpl foodDAO = new FoodDAOImpl();
		List<Food> foodList = foodDAO.getAll();
		System.out.println(foodList);
	}
}
