package com.constructors;
public class Flower{
	String Name="Jasmine";
	String color="white";
	Flower(){
		System.out.println("Parent class called:");
	}
	public static void main(String []args) {
		
	}
	
}
 class Rose extends Flower{
	 String Name="Rose";
	 String color="Red";
	 Rose(){
		 System.out.println("Child class called");
	 }
	 {
		 System.out.println("Ratnakar");
	 }
	public static void main(String []args) {
		Rose r = new Rose();
		r.flowerInfo();
	}
	void flowerInfo() {
		System.out.println("FlowerName:"+Name);
		System.out.println("color:"+color);
		System.out.println("FlowerName:"+super.Name);
		System.out.println("color:"+super.color);
	}
}