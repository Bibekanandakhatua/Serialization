package com.kodwalaserialization29jul;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Account acc = new Account(1200,"Raja", "sce123", "BLR");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("acc.ser"));
		oos.writeObject(acc);
		System.out.println("Driver.main().........Serialization");

	}

}
