package com.stream;

import java.util.function.Supplier;

public class E {

//	Method References

//	Method references provide the useful syntax to refer directly to existing methods
//	or constructors of Java classes or objects (instances). With conjunction of
//	Lambdas expressions, method references make the language constructs look compact
//	and concise, leaving off boilerplate.
//
//	Below, considering the class Car as an example of different method definitions,
//	let us distinguish four supported types of method references.

	public static class Car {

		public static Car create(final Supplier<Car> supplier) {
			return supplier.get();
		}

		public static void collide(final Car car) {
			System.out.println("Collided " + car.toString());
		}

		public void follow(final Car another) {
			System.out.println("Following the " + another.toString());
		}

		public void repair() {
			System.out.println("Repaired " + this.toString());
		}
	}

//	The first type of method references is constructor reference with the syntax
//	Class::new or alternatively, for generics, Class<T>::new. Please notice that
//	the constructor has no arguments.
//
//	final Car car = Car.create(Car::new);
//	final List<Car> cars = Arrays.asList(car);
//
//	The second type is reference to static method with the syntax
//	Class::static_method. Please notice that the method accepts exactly one
//	parameter of type Car.

//	cars.forEach(Car::collide);

}
