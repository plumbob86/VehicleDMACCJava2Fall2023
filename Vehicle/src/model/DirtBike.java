/**
 * @author Valerie Underwood - vlunderwood
 * CIS175 - Fall 2023
 * Aug 28, 2023
 */

package model;

public class DirtBike {

	// Instance variables describing the dirtbike
	private String name;
	private String color;
	private Integer size;

	// Parameterized constructor that accepts color, size, and name
	public DirtBike(String name, Integer size, String color) {
		this.name = name;
		this.size = size;
		this.color = color;
	}

	// Getter method for name
	public String getName() {

		return name;

	}

	// Setter method for name
	public void setName(String name) {

		this.name = name;

	}

	// Getter method for size
	public Integer getSize() {

		return size;

	}

	// Setter method for size
	public void setSize(Integer size) {

		this.size = size;

	}

	// Getter method for color
	public String getColor() {

		return color;

	}

	// Setter method for color
	public void setColor(String color) {

		this.color = color;

	}

	// overrides toString and returns dirtbikes description
	@Override
	public String toString() {
		return "Vehicle [Rider Name=" + name + ", Engine size=" + size + ", color=" + color + "]";
	}

	// returns the dirtbike noise
	public String makeNoise() {

		return "Vroom! Vroom!";
		
	}
}
