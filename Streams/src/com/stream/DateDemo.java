package com.stream;	

public class DateDemo {
	public static void main(String[] args) {
//		
//		java.util.Date date=new java.util.Date();
//		System.out.println(date);
		
//		java.sql.Date date=new java.sql.Date(0);
//		long value=date.getHours();
//		System.out.println(date);
		
//		long value=System.currentTimeMillis();
//		java.sql.Date date1= new java.sql.Date(value);
//		System.out.println(date1);
		

		java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());

		System.out.println(sqlDate);

	}

}
