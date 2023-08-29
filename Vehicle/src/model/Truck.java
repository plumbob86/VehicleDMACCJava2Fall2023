package model;

public class Truck {
	private String fuel;
	private String name = "Truck";
	private String model;
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String makeNoise() {
		return "VROOOM, YEE YEE!";
	}
	
	
}

