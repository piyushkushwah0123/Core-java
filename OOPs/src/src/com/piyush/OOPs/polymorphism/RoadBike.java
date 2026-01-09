package com.piyush.OOPs.polymorphism;

public class RoadBike extends Bicycle{
	
	private int tireWidth;

    public RoadBike(int gear, int speed, int tireWidth) {
        super(gear, speed);
        this.tireWidth = tireWidth;
    }
    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println
        ("RoadBike tire width: " + tireWidth + "mm");
    }
}
