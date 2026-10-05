package com.kodwaladeserialization29jul;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.jar.Attributes.Name;

import com.kodwalaserialization29jul.Account;

public class Driver1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("acc.ser"));
		
		Account account = (Account) ois.readObject();
		
		System.out.println("Driver1.main()..........deserialization");
		System.out.println("My balance is : "+ account.getBalance()+" My Location is :" +account.getLocation()+" My name is :"+account.getName()+" My IFCS code is :"+account.getIfscCode());

	}

}
