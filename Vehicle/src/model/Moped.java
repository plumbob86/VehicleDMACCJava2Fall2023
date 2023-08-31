package model;
/**
 * Cameron Mockobee - cmockobee1@dmacc.edu
 * CIS175 = - Fall 2023
 * Aug 30, 2023
 */

public class Moped {
	private String name = "Honda";
	private int maxSpeed;
	private String color;
	
	public Moped() {
		super();
	}
	
	/**
	 * @param name
	 * @param maxSpeed
	 * @param color
	 */
	public Moped(String name, int maxSpeed, String color) {
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the maxSpeed
	 */
	public int getMaxSpeed() {
		return maxSpeed;
	}

	/**
	 * @param maxSpeed the maxSpeed to set
	 */
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	public String makeNoise() {
		return "Vroom Vroom";
	}
	
}
