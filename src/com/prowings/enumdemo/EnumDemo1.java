package com.prowings.enumdemo;

enum Shape{
	
	SMALL,MEDIUM,LARGE,EXTRALARGE;
	
	Shape(){
		
		System.out.println("Constructor Invoked !!!");
	}
}
public class EnumDemo1 {
	
	public static void main(String[] args) {
		
		
//		String -to- Enum Constant
		
		String s = "SMALL";
		
		Shape shape = Shape.valueOf(s);
		
		System.out.println("##:= "+shape);
		
		
//		Enum -to- String Constant
		
		Shape shape1 = Shape.LARGE;
		
		String s1 = shape1.toString();
		
		System.out.println("@@:= "+s1);	
		
		
		selectShape(shape);
		
	}

	private static void selectShape(Shape shape) {
		
		switch(shape)
		{
		case SMALL:
			System.out.println("I Order Shape SMALL");
		    break;
		case MEDIUM:
			System.out.println("I Order Shape MEDIUM");
			break;
		case LARGE:
			System.out.println("I Order Shape LARGE");
			break;
		case EXTRALARGE:
			System.out.println("I Order Shape EXTRALARGE");
			break;
		default:
			System.out.println("I Dont Know Whoch Shape to Order");
			break;
     	}
		
	}

}
