package com.hibernate.entity;

public class Address {
	private Integer address;
	private String city;
	private String addressName;
	public Integer getAddress() {
		return address;
	}
	public void setAddress(Integer address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	@Override
	public String toString() {
		return "Address [address=" + address + ", city=" + city + ", addressName=" + addressName + "]";
	}
	
	
}
