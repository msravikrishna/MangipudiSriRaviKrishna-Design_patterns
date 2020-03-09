package com.epam.Factory_Method;
//Creational pattern
public class Factory_Method {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.displayArea();;
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.displayArea();;
		Shape shape3 = shapeFactory.getShape("TRIANGLE");
		shape3.displayArea();;
	}
}
interface Shape {
	public void displayArea();
}
class Rectangle implements Shape {
	int length=4,breadth=2,area;
	public void displayArea()
	{
		area=length*breadth;
		System.out.println("Area of Rectangle : "+area);
	}

}
class Circle implements Shape{
	double radius=4,area;
	public void displayArea()
	{
		area=3.14*radius*radius;
		System.out.println("Area of Circle : "+area);
	}
}
class Triangle implements Shape {
	int base=20,height=50,area;
	public void displayArea()
	{
		area=(base*height)/2;
		System.out.println("Area of triangle : "+area);
	}

}


class ShapeFactory {
	public Shape getShape(String shapeType){
		if(shapeType == null){
			return null;
		}		
		if(shapeType.equalsIgnoreCase("Circle")){
			return new Circle();

		} else if(shapeType.equalsIgnoreCase("Rectangle")){
			return new Rectangle();

		} else if(shapeType.equalsIgnoreCase("Triangle")){
			return new Triangle();
		}
		return null;
	}
}


