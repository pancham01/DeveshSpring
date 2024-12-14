package com.model;

public class Address {
	private String city, state;
	private int hNo;

	public Address() {

	}

	public Address(String city, String state, int hNo) {
		super();
		this.city = city;
		this.state = state;
		this.hNo = hNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int gethNo() {
		return hNo;
	}

	public void sethNo(int hNo) {
		this.hNo = hNo;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", hNo=" + hNo + "]";
	}
}
