package com.stream.piyush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.stream.Employee;

public class Testt {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Piyush", 25, "Male", "Development", 2014, 25000.00));
        employees.add(new Employee(2, "Aman", 26, "Male", "HR", 2016, 22000.00));
        employees.add(new Employee(3, "Riya", 32, "Female", "Finance", 2015, 30000.00));
        employees.add(new Employee(4, "Neha", 41, "Female", "Development", 2018, 35000.00));

        //1. All employees belonging to Development department
      /*  List<Employee> devEmployees = employees.stream()
                .filter(e -> e.getDepartment().equalsIgnoreCase("Development"))
                .collect(Collectors.toList());

        devEmployees.forEach(System.out::println);
       */
        
        //2. Highest salary
       /* double maxSalary =employees.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Development"))
                          .mapToDouble(Employee::getSalary).max().orElse(0);
                System.out.println(maxSalary);
               */
        
        //3. Total salary of Each Department 
      /*  employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
        		Collectors.summingDouble(Employee::getSalary))).values().forEach(System.out::println);
            */
        
        //4. 
        
        
        //6. Count no. of digits present in given string 
     /*   String str = "Java8Stream2026";
        long digitCount = str.chars().filter(Character::isDigit).count();
        System.out.println(digitCount);
     */
        
        //7. Most Frequently Occurring Element
    /*    List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 2, 3, 3, 3); 
        Integer mostFrequent = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                          .entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
        System.out.println(mostFrequent);
     */
        
        //12. Unqiue characters in a String
     /*   String str = "programming";
        String result =str.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(result);
      */
        
        //
    }
}
