package test;

import java.util.List;

public interface CouponsDAO {
	
	public abstract CouponsBean createOrUpdate(String coupon, int discount, java.sql.Date deadline, Integer times, String notes);
	
	public abstract List<CouponsBean> selectAll();
	
	public abstract boolean delete(String coupon);
	
}
