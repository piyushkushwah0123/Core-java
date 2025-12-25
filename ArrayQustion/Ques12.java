// Q:- Find out Element at specific position in an array.

package ArrayQustion;

import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        int arr[] = { 3, 7, 8, 2, 5, 6, 4 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index number = ");
        
        int place = sc.nextInt();
        if (place < arr.length) {
            System.out.println(arr[place]);
        } else {
            System.out.println("Invalid index! Please enter between 0 and " + (arr.length - 1));
        }
    }
}