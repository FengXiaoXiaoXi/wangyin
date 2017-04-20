package com.hibernate.entity;

public class UserInfo {
	private int ID;
	private String USERNAME;
	private String PASSWORD;
	private String SEX;
	private String AGE;
	private Address ADDRESS;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getSEX() {
		return SEX;
	}
	public void setSEX(String sEX) {
		SEX = sEX;
	}
	public String getAGE() {
		return AGE;
	}
	public void setAGE(String aGE) {
		AGE = aGE;
	}
	public Address getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(Address aDDRESS) {
		ADDRESS = aDDRESS;
	}
	
}
