package com.kodwalaserialization29julpratice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Driver2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Bank b1 = new Bank(123, "BLR", "BTM layout2nd stage", "Bibekananda");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bank..ser"));
		
		oos.writeObject(b1);
		
		System.out.println("Driver2.main()....ser");

	}

}
