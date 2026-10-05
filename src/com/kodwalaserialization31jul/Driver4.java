package com.kodwalaserialization31jul;

class Address implements Cloneable {
	
	String line1;

	public Address(String line1) {
		super();
		this.line1 = line1;

	}
	
}
class Employee implements Cloneable{
	
	String name;
	Address address;
	
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}

public class Driver4 {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address("BTM 2nd Stage");
		Employee e1 = new Employee("donni",address);
		Employee e2 = (Employee) e1.clone();
		e2.address.line1 = "Stage Number";
		
		System.out.println(e2.name);
		System.out.println(e2.address.line1);
		
		System.out.println(e1.name);
		System.out.println(e1.address.line1);
	}

}
