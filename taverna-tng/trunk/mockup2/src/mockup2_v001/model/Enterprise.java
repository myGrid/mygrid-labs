package mockup2_v001.model;

// topmost class in the hierarchy

public class Enterprise extends Node {

	private String address;
	private int capital;
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCapital(int capital) {
		this.capital = capital;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public int getCapital() {
		return this.capital;
	}
}
