package model;

/**
 * @author Jack Aden jacka
 * CIS175 - Fall 2023
 * 8/31/2023
 */

public class Boat {
	private String name = "Billy";
	private int passengers = 4;
	private String color = "blue";
	
	//no arg contructor
	public Boat() {
		super();
	}
	//constructor
	public Boat(String name, int passengers, String color) {
		super();
		this.name = name;
		this.passengers = passengers;
		this.color = color;
	}
	
	// getters and setters
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPassengers() {
		return passengers;
	}
	
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String makeNoise() {
		return "HONK HONK!!";
	}
}
