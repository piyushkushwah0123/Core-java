package com.piyush.OOPs.multipleInheritance;
//Multiple inheritance using interfaces
public class Car implements Engine, MusicSystem  {
	 @Override
	    public void start() {
	        System.out.println("Engine started");
	    }

	    @Override
	    public void playMusic() {
	        System.out.println("Music playing");
	    }

	    public static void main(String[] args) {
	        Car car = new Car();

	        System.out.println("Multiple Inheritance : \n");
	        car.start();
	        car.playMusic();
	    }

}
