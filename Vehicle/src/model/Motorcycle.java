package model;

/**
 * @author Corbin Goodman - cgoodman4
 * CIS175 - Fall 2023
 * Aug 29, 2023
 */

public class Motorcycle{
	private int year;
	private String make;
	private String model;
	
	public Motorcycle() {
		super();
	}
	
	public Motorcycle(int year, String make, String model) {
		this.year = year;
		this.make = make;
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return String.format("This motorcycle is a %d %s %s",this.year,this.make,this.model);
	}
	
	public String makeNoise() {
		return "vroom vroom";
	}
}

