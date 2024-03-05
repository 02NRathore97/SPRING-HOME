package in.com.spring.beans;

public class Address {
	private int houseNo;
	private String city;
	private String state;

	

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String toString() {
		return "HouseNo : " + houseNo + " City : " + city + " State : " + state;
	}
}
