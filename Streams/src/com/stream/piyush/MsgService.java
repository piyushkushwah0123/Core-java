package com.stream.piyush;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {
	public static void main(String[] args) {
		
		User u = new User();
		
		System.out.println(" Enter the user Id and get the user Name");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		Optional<String> name = u.getuserName(id);
		
		if(name.isPresent()) {
			System.out.println(name.get().toUpperCase()+ " "+ "Hello, How are you.........");
		}
		
		else {
			System.out.println("Data Not Found........");
		}
	}

}
