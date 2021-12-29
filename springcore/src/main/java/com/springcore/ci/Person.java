package com.springcore.ci;

public class Person {
	private String name;
	private String personId;
	private Certi certi;
	
	
	public Person(String name , String personId,Certi certi) {
		this.name=name;
		this.personId=personId;
		this.certi=certi;
		
	}


	@Override
	public String toString() {
		return this.name+" : "+this.personId;
	}
	
	
	

}
