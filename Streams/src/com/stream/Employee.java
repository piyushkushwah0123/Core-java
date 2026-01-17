package com.stream;

public class Employee {
	
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearofJoining;
	double salary;
	
	public Employee() {
		
	}
	public Employee(int id, String name, int age, String gender, String department, int yearofJoining, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearofJoining = yearofJoining;
		this.salary = salary;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearofJoining() {
		return yearofJoining;
	}
	public void setYearofJoining(int yearofJoining) {
		this.yearofJoining = yearofJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

}
