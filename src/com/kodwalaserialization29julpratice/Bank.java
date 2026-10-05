package com.kodwalaserialization29julpratice;

import java.io.Serializable;

public class Bank implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4053902644453689571L;
	private int ifcscode;
	private String location;
	private String address;
	private String bankHolderName;
	
	
	

	public Bank(int ifcscode, String location, String address, String bankHolderName) {
		super();
		this.ifcscode = ifcscode;
		this.location = location;
		this.address = address;
		this.bankHolderName = bankHolderName;
		
	}


	public int getIfcscode() {
		return ifcscode;
	}


	public String getLocation() {
		return location;
	}


	public String getAddress() {
		return address;
	}


	public String getBankHolderName() {
		return bankHolderName;
	}
	

}
