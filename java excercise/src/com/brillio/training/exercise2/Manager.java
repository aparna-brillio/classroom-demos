package com.brillio.training.exercise2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Manager extends Employee{
	private String currentProject;
	Date projectStartDate;
public Manager() {

}





public Manager(int id, String name, double salary, String currentProject,String projectStartDate) {
	super(id, name, salary);
	this.currentProject = currentProject;
	this.projectStartDate = stringToDate(projectStartDate);
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
	return super.toString()+"Manager [currentProject=" + currentProject + ", projectStartDate=" + projectStartDate + "]";
}

}
