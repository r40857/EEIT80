package test;

import java.sql.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hibernate.util.HibernateUtil;




public class CouponsDAOHibernate implements CouponsDAO {

	private SessionFactory sessionFactory = null;
	public CouponsDAOHibernate(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	public CouponsBean createOrUpdate(String coupon, int discount, Date deadline, Integer times, String notes) {
		CouponsBean result = new CouponsBean();
		result.setCoupon(coupon);
		result.setDiscount(discount);
		result.setDeadline(deadline);
		result.setTimes(times);
		result.setNotes(notes);
		this.getSession().saveOrUpdate(result);
		return result;
	}

	@Override
	public List<CouponsBean> selectAll() {
		Query query = this.getSession().createQuery("from CouponsBean");
		return (List<CouponsBean>) query.list();
	}

	@Override
	public boolean delete(String coupon) {
		CouponsBean result = (CouponsBean) this.getSession().get(CouponsBean.class, coupon);
		if(result != null){
			this.getSession().delete(result);
			return true;
		}
		return false;
	}

//	public static void main(String[] args) {
//		try {
//			HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
//			
//			CouponsDAOHibernate dao = new CouponsDAOHibernate(HibernateUtil.getSessionFactory());
//	//		List<CouponsBean> bean = dao.selectAll();
//			long s = new java.util.Date().getTime();
//			dao.createOrUpdate("xxxxx", 15, new java.sql.Date(s), 15, null);
//			
//			
//			
////			System.out.println(bean);
//			
//			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
//		} finally {
//			
//		}
//	}
	
}
