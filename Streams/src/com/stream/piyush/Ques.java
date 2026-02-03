package com.stream.piyush;

import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    String dept;
    double salary;

    Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class Ques {

    public static void main(String[] args) {

        // Sample data
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", "IT", 50000),
                new Employee(2, "Ravi", "HR", 40000),
                new Employee(3, "Neha", "IT", 70000),
                new Employee(4, "Priya", "HR", 45000),
                new Employee(5, "Karan", "IT", 60000)
        );

        // Q1. Employees from IT department
       // employees.stream().filter(e -> e.dept.equals("IT")).forEach(e -> System.out.println("IT Emp: " + e.name));
        /* 
         List ko stream m convert kiya , condition lagayi e.dept jisse sirf whii emp aayenge jiske depart. IT hoga 
         e -> ek employee object ,, for each se emp name print karwa diye  
         */

        
        // Q2. Employee with highest salary
//        Employee maxSalEmp = employees.stream().max(Comparator.comparing(e -> e.salary)).get();
//        System.out.println("Highest salary: " + maxSalEmp.name);
        /*
          List ko stream m convert kiya , condition lagayi compartor.comparing salary pr ( bcz compator btata h 
          compare kis basis pr krna hai 
          max() optional<employee> return krta hai kyuki list empty bhi ho sakti h so we use get() its says give 
          me value it is not empty
          after that we print name of that high salary emp
         */

        
        // Q3. Total salary department-wise
//        Map<String, Double> Salary =employees.stream().collect(Collectors.groupingBy(e -> e.dept,
//                                Collectors.summingDouble(e -> e.salary)));
//        System.out.println("salary: " + Salary);
       /*
        List ko stream mai convert kiya , department ke basis pr grouping lagayi ( same elements ko group krta h )
        summing(group ki salary ka total(sum) krta krta hai 
        collect ne stream ke data ko final form m badalta h map<string,double>
        then we store in map and excutes that     
        */
        

        // Q4. Top 3 highest paid employees
//        employees.stream().sorted((a, b) -> Double.compare(b.salary, a.salary)).limit(3)
//        .forEach(e -> System.out.println("Top: " + e.name));
        /*
          list to stream , sorted() -> elements ka order sort , we follow b -> a bcz descending order ( phle high salary)
          limit(3) -> 3 elements print honge bss , foreach for excutes 
         */
        

        // Q6. Count digits in string
//        String str = "java1234";
//        long digitCount = str.chars().filter(Character::isDigit).count();
//        System.out.println("Digits: " + digitCount);
        /*
         str.chars()-> string to stream convert and it give ascii value unicode 
         digits character filter kiye , .count() count ki digits and then print that    
         */
        

        // Q7. Most frequent element
//        List<Integer> nums = Arrays.asList(1,2,2,3,3,3);
//        int freq = nums.stream().collect(Collectors.groupingBy(n->n, Collectors.counting())).entrySet().stream()
//                .max(Map.Entry.comparingByValue()).get().getKey();
//        System.out.println("Most frequent: " + freq);
        /*
         list to stream convert , groupingBy( same elements ko group krta hai) ,, counting -> group ke elements ki counting
         .entrySet().stream()->map k key + value pr kaam krta hai
         map.entry.cpmaparingbyvalue(entry nikalta h jiske count value sabse jyada hoti hai 
         .getKey(most frquent element nikalega) 
         */
        
        // Q8. Average length of strings
//        List<String> words = Arrays.asList("java", "spring", "boot");
//        double avgLen = words.stream()
//                .mapToInt(String::length)
//                .average().getAsDouble();
//        System.out.println("Avg length: " + avgLen);
        /*
        first we make array list then List<string> to stream<string> convert, 
        stream ki harr value ko int mai convert krta h , average (mean)value nikalta hai 
        optional double ke andar se actual value nikalta hai
         */
        
        
        // Q9. Factorial using stream
//        List<Integer> nums = Arrays.asList(3, 4, 5);
//        nums.stream().forEach(n -> {int fact = IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);
//        System.out.println(n + " -> " + fact);});
        /*
         List to stream , list ke harr elements ke liye andar ka ode chalata hai 
         we used Intstream.rangeClosed(1,n) its is best for factorial and it make stream from 1 to n
         and reduce()-> stream ke sab values ko single value me convert kr deta hai  	
         */
        
        
        // Q10. Longest word in sentence
        String sentence = "java stream api is powerful";
        String longestWord = Arrays.stream(sentence.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println("Longest word: " + longestWord);
        /*
         Array->stream<string> mai convert 
         max() -> sabse bda element nikal kr dega, comparator -> words ko length ke basis pr compare
         .get() -> optional value ke andar se actual value nikalta  hai 
         */
       
        
        // Q11. Longest palindrome string
//        List<String> strList = Arrays.asList("madam", "level", "java");
//        String longestPalindrome = strList.stream()
//                .filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
//                .max(Comparator.comparing(String::length)).get();
//        System.out.println("Longest palindrome: " + longestPalindrome);
     
        

        // Q12. Unique characters in string
//        System.out.print("Unique chars: ");
//        "programming".chars().distinct()
//                .forEach(c -> System.out.print((char)c+" "));
//        System.out.println();
     
        

        // Q13. Count distinct elements
//        long distinctCount = nums.stream().distinct().count();
//        System.out.println("Distinct count: " + distinctCount);



        // Q14. Reverse each string
//        words.stream()
//                .map(s -> new StringBuilder(s).reverse().toString())
//                .forEach(s -> System.out.println("Reverse: " + s));
      
        

        // Q15. Difference between two lists
//        List<Integer> list1 = Arrays.asList(1,2,3,4);
//        List<Integer> list2 = Arrays.asList(3,4);
//        list1.stream()
//                .filter(e -> !list2.contains(e))
//                .forEach(e -> System.out.println("Diff: " + e));
     
        

        // Q16. Sort strings by last character
//        words.stream()
//                .sorted(Comparator.comparing(s -> s.charAt(s.length()-1)))
//                .forEach(s -> System.out.println("Sorted: " + s));
    
        

        // Q17. First repeated element
//        Set<Integer> set = new HashSet<>();
//        Integer firstRepeat = nums.stream()
//                .filter(i -> !set.add(i))
//                .findFirst().get();
//        System.out.println("First repeated: " + firstRepeat);
     
        

        // Q18. Shortest string
//        String shortest = words.stream()
//                .min(Comparator.comparing(String::length)).get();
//        System.out.println("Shortest: " + shortest);
     
        

        // Q19. First longest word
//        String firstLongest = Arrays.stream(sentence.split(" "))
//                .sorted((a,b)->b.length()-a.length())
//                .findFirst().get();
//        System.out.println("First longest: " + firstLongest);
     
        

        // Q20. Check sub-list
//        boolean containsAll = list1.containsAll(list2);
//        System.out.println("Contains list2: " + containsAll);
     
        

        // Q21. Count employees
//        long empCount = employees.stream().count();
//        System.out.println("Employee count: " + empCount);
     
        
    }
}
