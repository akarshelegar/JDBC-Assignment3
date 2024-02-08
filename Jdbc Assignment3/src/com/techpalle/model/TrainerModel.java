package com.techpalle.model;

public class TrainerModel {
	private int id;
	private String name;
	private int salary;
	private String course;
	private String location;
	
	public TrainerModel(int id, String name, int salary, String course, String location)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.course=course;
		this.location=location;
		
	}
	
	public int getId()
	{
		return id;
	}
	public void SetInt(int id)
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void SetName(String name)
	{
		this.name=name;
	}
	public int getSalary()
	{
		return salary;
	}
	public void SetSalary(int salary)
	{
		this.salary=salary;
	}
	public String getCourse()
	{
		return course;
	}
	public void SetCourse(String course)
	{
		this.course=course;
	}
	public String getLocation()
	{
		return location;
	}
	public void SetLocation(String location)
	{
		this.location=location;
	}

}
