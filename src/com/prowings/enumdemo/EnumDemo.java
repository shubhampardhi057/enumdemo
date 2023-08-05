package com.prowings.enumdemo;

enum Size{
	
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	
	int val = 10;
	
	Size(){
		
		System.out.println("Constuctor Invoked!!!");
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
}
public class EnumDemo {
	
	
	public static void main(String[] args) {
		
		Size size = Size.MEDIUM;
		
		System.out.println(size);
		
		size.getVal();
		
		size.setVal(20);
		
		
	}

}
