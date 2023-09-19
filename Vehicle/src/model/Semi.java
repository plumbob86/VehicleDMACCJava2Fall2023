package model;

/**
 * @author Rachel Schulz - rsgoodrich
 * CIS175 - Fall 2023
 * Aug 30, 2023
 */
public class Semi {
	private String name = "Semi";
	private String companyName;
	private double trailerLengthInFeet;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return companyName;
	}

	public void setCompany(String company) {
		this.companyName = companyName;
	}

	public double getTrailerLengthInFeet() {
		return trailerLengthInFeet;
	}

	public void setTrailerLengthInFeet(double trailerLengthInFeet) {
		this.trailerLengthInFeet = trailerLengthInFeet;
	}
	
	public String makeNoise() {
		return "PSHOOOOO (air brake)";
	}
}
