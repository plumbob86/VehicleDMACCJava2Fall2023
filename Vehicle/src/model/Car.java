package model;

/**
 * @author Kenneth Nimmo - Knimmo
 * CIS175 - Fall 2021
 * Aug 24, 2023
 */
public class Car {
	
	private int weight;
	private int numWheels;
	private String name = "Car";
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight)  {
		this.weight = weight;
	}
	
	public String getName() {
		return name;
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
	
	public String makeNoise() {
		return "HonkHonk!";
	}

}
