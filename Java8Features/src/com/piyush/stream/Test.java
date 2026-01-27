package com.piyush.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Dish {
	String name;
	int calories;
	boolean isVeg;
	String type;
	int price;

	public Dish(String name, int calories, boolean isVeg, String type, int price) {
		super();
		this.name = name;
		this.calories = calories;
		this.isVeg = isVeg;
		this.type = type;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", calories=" + calories + ", isVeg=" + isVeg + ", type=" + type + ", price="
				+ price + "]";
	}

}

public class Test {
	public static void main(String[] args) {
		Dish d1 = new Dish("chicken Biryani", 500, false, "village style", 400);
		Dish d2 = new Dish("fish curry", 300, false, "Restaurent style", 300);
		Dish d3 = new Dish("veg Rice", 200, true, "Restaurent style", 250);
		Dish d4 = new Dish("Dal tadka And Chapati", 300, true, "Dhaba style", 350);
		Dish d5 = new Dish("Manchurian", 100, true, "chinese street food", 150);
		Dish d6 = new Dish("Mutton Biryani", 700, false, "Desi style", 500);
		Dish d7 = new Dish("Dosa", 120, true, "indian style", 320);
		Dish d8 = new Dish("Juice", 100, true, "process style", 65);

		List<Dish> dishes = Arrays.asList(d1, d2, d3, d4, d5, d6, d7, d8);

		// Collectors.counting() ---------------> long

		long countingOfDishes = dishes.stream().collect(Collectors.counting());
		System.out.println(countingOfDishes);

		// finding maximum and minimum in a stream of values

		Comparator<Dish> maximum = Comparator.comparingInt(i -> i.calories);
		Optional<Dish> dishWithMaximumcalories = dishes.stream().collect(Collectors.maxBy(maximum));
		System.out.println(dishWithMaximumcalories);

		Comparator<Dish> minimum = Comparator.comparingInt(i -> i.calories);
		Optional<Dish> dishWithMinimumcalories = dishes.stream().collect(Collectors.minBy(maximum));
		System.out.println(dishWithMinimumcalories);

		// Summarizing
		
		List<Dish> MansukhDish = Arrays.asList(d3,d4,d4,d8);
		int totalCalories = MansukhDish.stream().collect(Collectors.summingInt(i->i.calories));
		System.out.println(totalCalories);
		 
		// Price total Bill
		
		int totalBill =MansukhDish.stream().collect(Collectors.summingInt(i->i.price));
		System.out.println(totalBill);
		
		// Average
		
		double aveg=MansukhDish.stream().collect(Collectors.averagingInt(i->i.calories));
		System.out.println(aveg);
	}

}
