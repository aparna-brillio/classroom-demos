package com.brillio.training.exercise2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	private int id;
	private String name;
	private String city;
	Date dt;

	public Customer() {

	}

	public Customer(int id, String name, String city, String dt) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.dt =stringToDate(dt);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDt() {
		return dt;
	}

	public void setDt(Date dt) {
		this.dt = dt;
	}
private static Date stringToDate(String input) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(input);
		} catch (ParseException e) {
		return null;
		}
	
	}

@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", city=" + city + ", dt=" + dt + "]";
}



	
}
