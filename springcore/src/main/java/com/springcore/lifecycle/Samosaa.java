package com.springcore.lifecycle;

public class Samosaa{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Samosaa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosaa [price=" + price + "]";
	}
	
	
	
	public void init() {
		
		System.out.println("this is init method");
	}
	
	public  void Des() {
		
		
		System.out.println("this is the destroy method");
	}

}
