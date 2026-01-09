package com.piyush.OOPs.inheritance;
// Subclass using Inheritance
public class MountainBike extends Bicycle {

	private int seatHeight;
	// Calling parent constructor using super()
	public MountainBike(int speed, int gear, int seatHeight) {
		super(speed, gear); // calling parent constructor
		this.seatHeight = seatHeight;
	}
	// Overriding parent method
	@Override
	public void display() {
		super.display(); // calling parent method
		System.out.println("Seat Height: " + seatHeight);
	}
	public void showParentSpeed() {
		System.out.println("Parent speed using super: " + super.speed);
		// accessing parent variable
	}
}
