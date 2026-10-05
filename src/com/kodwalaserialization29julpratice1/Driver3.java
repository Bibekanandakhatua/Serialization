package com.kodwalaserialization29julpratice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.kodwalaserialization29julpratice.Bank;

public class Driver3 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bank..ser"));
		
		Bank bank = (Bank) ois.readObject();
		
		System.out.println("Driver3.main()......de-ser");
		System.out.println("My name is "+bank.getBankHolderName()+" My address is "+bank.getAddress()+" My location is "+bank.getLocation()+" My ifcscode is "+bank.getIfcscode());
		
		

	}

}
