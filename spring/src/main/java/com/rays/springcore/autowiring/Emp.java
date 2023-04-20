package com.rays.springcore.autowiring;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		System.out.println("Emp Constructor");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}
