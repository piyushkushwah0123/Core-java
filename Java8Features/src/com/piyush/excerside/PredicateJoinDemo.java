package com.piyush.excerside;
import java.util.function.Predicate;

// Without Lambda Expression
// With Lambda Expression
// Predicate Joining
// Multiple Predicate ------> Join -----> default OR, AND, NEGATE ---> Predicate Joining
// Negate -> reverse
// Q. Number lesser than 50 and Even Number ---> and 
public class PredicateJoinDemo {

    public static void checkPredicate(Predicate<Integer> p, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (p.test(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String... k) {

        int numbers[] = { 10, 20, -20, -10, 40, 60, 45, 100, 21, 110 }; // less than 50

        Predicate<Integer> p1 = i -> (i < 50);      // less than 50
        Predicate<Integer> p2 = i -> i % 2 == 0;    // Even Number

        // Predicate<Integer> p3 = i -> i % 2 != 0; // Odd Number
        // Predicate<Integer> p4 = i -> i % 5 == 0; // divisible by 5

        Predicate<Integer> oddNumber = p2.negate();

        // System.out.println(oddNumber);
        // checkPredicate(p1, numbers);

        Predicate<Integer> greaterThanFifty = p1.negate();
        // checkPredicate(oddNumber, numbers);

        checkPredicate(greaterThanFifty, numbers);
        
        
        Predicate<Integer>EvenNumbersAndLessThanFifty = p1.and(p2);
        checkPredicate(EvenNumbersAndLessThanFifty, numbers);
        
    }
}
