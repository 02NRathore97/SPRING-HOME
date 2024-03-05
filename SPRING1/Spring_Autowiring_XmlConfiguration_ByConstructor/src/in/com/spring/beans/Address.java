package in.com.spring.beans;

public class Address {
	private int houseNo;
	private String city;
	private String state;

	public Address(int houseNo, String city, String state) {
		
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
	}

	public String toString() {
		return "HouseNo : " + houseNo + " City : " + city + " State : " + state;
	}
}
