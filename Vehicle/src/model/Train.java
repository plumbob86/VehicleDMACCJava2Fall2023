package model;

public class Train {

	private Integer length;
	private String name = "Train";

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String makeNoise() {
		return "ChooChoo!";
	}

}
