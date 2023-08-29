package model;


/**
 * @author Itsal - Quinn Birdsley
 * CIS175 - Fall 2023
 * Aug 28, 2023
 */
 /**
 * @author Kenneth Nimmo - Knimmo
 * CIS175 - Fall 2021
 * Aug 24, 2023
 */
public class Car {
	private String name = "Car"; // name of vehicle
	private int passangers; // amnt of passangers the car can hold
	private double maxSpeed;// the max speed of car
	private int weight;
	private int numWheels;
	
	/**
	 * 
	 */
	public Car() { // no argument constructor
		super();
	}
	public Car(String name, int passangers, double maxSpeed) {
		// Constructor
		super();
		this.name = name;
		this.passangers = passangers;
		this.maxSpeed = maxSpeed;
	}

	// all getters and setters

	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight)  {
		this.weight = weight;
	}
	
	public void  setName(String name) {
		this.name = name;
	}
	
	public int getPassangers() {
		return passangers;
	}
	
	public void setPassangers(int passangers) {
		this.passangers = passangers;
	}
	
	public double getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public String makeNoise() {
		return "beep beep";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumWheels() {
		return numWheels;
	}
	
	public void setNumWheels(int wheels) {
		this.numWheels = wheels;
	}
	

}
