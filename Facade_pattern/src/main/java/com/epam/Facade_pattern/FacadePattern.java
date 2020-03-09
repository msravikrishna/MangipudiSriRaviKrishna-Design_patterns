package com.epam.Facade_pattern;
// Structural pattern
public class FacadePattern {
	public static void main(String[] args) {
		VehicleTyres tyres=new VehicleTyres();
		tyres.getno_of_CarTyres();
		tyres.getno_of_BikeTyres();
		tyres.getno_of_TrainTyres();
	}
}

interface Vehicle {
	public void no_of_tyres();
}
class Bike implements Vehicle {
	public void no_of_tyres()
	{
		System.out.println("Bike has only Two Tyres");
	}
}
class Car implements Vehicle {
	public void no_of_tyres()
	{
		System.out.println("Car has four Tyres");
	}

}

class Train implements Vehicle {
	public void no_of_tyres()
	{
		System.out.println("Train has many tyres");
	}
}
class VehicleTyres {
	private Vehicle car;
	private Vehicle bike;
	private Vehicle train;

	public VehicleTyres() {
		car = new Car();
		bike = new Bike();
		train = new Train();
	}

	public void getno_of_CarTyres(){
		car.no_of_tyres();
	}
	public void getno_of_BikeTyres(){
		bike.no_of_tyres();
	}
	public void getno_of_TrainTyres(){
		train.no_of_tyres();
	}
}