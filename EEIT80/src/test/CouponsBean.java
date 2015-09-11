package test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.Nullable;

@Entity
@Table(name = "Coupons")
public class CouponsBean {
	
	@Id
	@Column(name = "coupon")
	private String coupon;
	
	@Column(name = "discount")
	private int discount;
	
	@Column(name = "deadline")
	private java.sql.Date deadline;
	
	@Column(name = "times")
	private Integer times;
	
	@Column(name = "notes")
	private String notes;
	
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Integer getTimes() {
		return times;
	}
	public void setTimes(Integer times) {
		this.times = times;
	}
	public java.sql.Date getDeadline() {
		return deadline;
	}
	public void setDeadline(java.sql.Date deadline) {
		this.deadline = deadline;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
}
