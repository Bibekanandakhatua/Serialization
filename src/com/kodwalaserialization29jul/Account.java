package com.kodwalaserialization29jul;

import java.io.Serializable;

public class Account implements Serializable 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3009799537694136908L;
	private int balance;
	private String name;
	private String ifscCode;
	private String location;
	
	Account(int balance,String name,String ifscCode,String location){
		
		this.balance = balance;
		this.name = name;
		this.ifscCode = ifscCode;
		this.location = location;
		
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public String getLocation() {
		return location;
	}
	
	
	

}
