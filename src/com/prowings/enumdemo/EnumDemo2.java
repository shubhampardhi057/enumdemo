package com.prowings.enumdemo;

enum Days{
	
	SUNDAY,MONDAY,TUESDAY,WEDNSEDAY,THURSDAY,FRIDAY,SATURDAY;
	
	int weekDays = 7;
	
	Days(){
		
		System.out.println("Constuctor Invoked !!!");
	}

	public int getVal() {
		return weekDays;
	}

	public void setVal(int weekDays) {
		this.weekDays = weekDays;
	}
	
	public void m1() {
		System.out.println("m1 method");
	}
}

public class EnumDemo2 {
	
	public static void main(String[] args) {
		
		Days days = Days.THURSDAY;
		
		days.m1();
		
		System.out.println(days);
		
		System.out.println(days.weekDays);
		
		System.out.println(days.ordinal());
		
		
		
	}

}
