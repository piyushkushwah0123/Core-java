package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		
		List<Employee>employeeList=new ArrayList<>();
		
		employeeList.add(new Employee(1, "Piyush",25, "Male", "Development", 2014, 25000.00));
		employeeList.add(new Employee(2, "Aman",26, "Male", "HR", 2016, 22000.00));
		employeeList.add(new Employee(3, "Riya",32, "Female", "Finance", 2015, 30000.00));
		employeeList.add(new Employee(4, "Neha",41, "Female", "Development", 2018, 35000.00));
		employeeList.add(new Employee(5, "Rahul",27, "Male", "Testing", 2017, 28000.00));
		employeeList.add(new Employee(6, "Sneha",33, "Female", "HR", 2019, 24000.00));
		employeeList.add(new Employee(7, "Arjun",28, "Male", "Development", 2013, 45000.00));
		employeeList.add(new Employee(8, "Kiran",22, "Male", "Support", 2020, 20000.00));
		employeeList.add(new Employee(9, "Priya",29, "Female", "Finance", 2016, 32000.00));
		employeeList.add(new Employee(10, "Vikas",32, "Male", "Testing", 2014, 27000.00));
		employeeList.add(new Employee(11, "Anjali",34, "Female", "HR", 2012, 38000.00));
		employeeList.add(new Employee(12, "Rohit",24, "Male", "Development", 2011, 50000.00));
		employeeList.add(new Employee(13, "Kavita",30, "Female", "Support", 2018, 23000.00));
		employeeList.add(new Employee(14, "Suresh",29, "Male", "Finance", 2010, 55000.00));
		employeeList.add(new Employee(15, "Meena",28, "Female", "Testing", 2019, 26000.00));
		employeeList.add(new Employee(16, "Deepak",37, "Male", "Development", 2017, 34000.00));
		employeeList.add(new Employee(17, "Nisha",31, "Female", "HR", 2015, 29000.00));
		employeeList.add(new Employee(18, "Manoj",39, "Male", "Support", 2016, 21000.00));
		employeeList.add(new Employee(19, "Pooja",28, "Female", "Finance", 2014, 36000.00));
		employeeList.add(new Employee(20, "Ajay",40, "Male", "Testing", 2013, 31000.00));
		employeeList.add(new Employee(21, "Shalini",42, "Female", "Development", 2021, 40000.00));
		employeeList.add(new Employee(22, "Mohit",27, "Male", "HR", 2020, 25000.00));
		employeeList.add(new Employee(23, "Sunita",23, "Female", "Support", 2012, 27000.00));
		employeeList.add(new Employee(24, "Naveen",30, "Male", "Finance", 2018, 42000.00));
		employeeList.add(new Employee(25, "Isha",34, "Female", "Testing", 2016, 33000.00));
		employeeList.add(new Employee(26, "Rakesh",38, "Male", "Development", 2009, 60000.00));

		//1. How many Male and female employee are there in the organisation with using Stream Api ?
		
	Map<String,Long>map1=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	System.out.println(map1);
	
	 //2. Print the name of All department in the organisation

		employeeList.stream().map(Employee::getDepartment).distinct().forEach(name->System.out.println(name));
	
	//3. What is the average age of male and female employee
		
		Map<String,Double>map2=employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(map2);
		
		//4. Get the details of highest paid employee in the organisation 
		
		//5. Get the names of All employee who have joined after 2015
		
		employeeList.stream().filter(e->e.getYearofJoining()>2015).map(Employee::getName).forEach(name->System.out.println(name));
		
		//6. Count the number of employee in each department
		
		
	}
	
}
