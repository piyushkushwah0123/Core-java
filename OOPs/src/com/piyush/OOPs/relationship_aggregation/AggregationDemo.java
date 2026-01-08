package com.piyush.OOPs.relationship_aggregation;

public class AggregationDemo {

	public static void main(String[] args) {

		Teacher t = new Teacher("Prasoon Sir");
		Department dept = new Department(t);

		dept.show();
	}
}
