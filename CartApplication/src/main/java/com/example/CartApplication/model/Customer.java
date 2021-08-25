package com.example.CartApplication.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="orderDetails")
public class Customer {
	@Column
    private String name;
	@Column
	private String mobileNo;
	@Column
	@Id
	private int orderId;
	@Column
	private String orderType;
	@Column
	private Date date;
	@Column
	private Time time;
	@Column
	private float price;
	@Column
	private String address;
	@Column
	private String status;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public float getPrice() {
		return price;
	}
	public Customer(String name, String mobileNo, int orderId, String orderType, Date date, Time time, float price,
			String address, String status) {
		super();
		this.name = name;
		this.mobileNo = mobileNo;
		this.orderId = orderId;
		this.orderType = orderType;
		this.date = date;
		this.time = time;
		this.price = price;
		this.address = address;
		this.status = status;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	Customer(){
		
	}
	
	



}

