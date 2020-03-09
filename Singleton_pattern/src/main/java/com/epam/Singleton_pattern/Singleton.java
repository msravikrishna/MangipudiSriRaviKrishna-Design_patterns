package com.epam.Singleton_pattern;
// Creational pattern
class Shape {
	public static Shape shape=new Shape();
	public static Shape getInstance()
	{
		return shape;
	}
	private Shape()
	{

	}
	public void getShape()
	{
		System.out.println("The Shape is Square");
	}

}
public class Singleton {
	public static void main(String[] args) {
		Shape s = Shape.getInstance();
		s.getShape();
	}

}

