package com.constructors;

public class Bike {
	int bikeNum;
	String Name;
	String model;
	String brand;
	String color;
	Bike(){
		this(8080);
		System.out.println("No arg constructor");
	}
	Bike(int bikeNum){
		this(bikeNum,"Honda shine");
		System.out.println("1 arg constructor");
	}
	Bike(int bikeNum,String Name){
		this(bikeNum,Name,"2.0");
		System.out.println("2 arg constructor");
	}
	Bike(int bikeNum,String Name,String model){
		this(bikeNum,Name,model,"Hero Honda");
		System.out.println("3 arg constructor");
	}
	Bike(int bikeNum,String Name,String model,String brand){
		this(bikeNum,Name,model,brand,"Red");
		System.out.println("4 arg constructor");
	}
	Bike(int bikeNum,String Name,String model,String brand,String color){
		this.bikeNum=bikeNum;
		this.Name=Name;
		this.model=model;
		this.brand=brand;
		this.color=color;
		System.out.println("5 arg constructor");
	}
	{
		System.out.println("Instance block Created In Parent Class");
		System.out.println("---------------------------------");
	}
	//class Sccoty extends Bike{
	//	int bikeNum;
	//	String Name;
	//	String model;
	//	String brand;
	//	String color;
	//	Sccoty(){
	//		this(8080);
	//		System.out.println("No arg constructor");
	//	}
	//	Sccoty(int bikeNum){
	//		this(bikeNum,"Honda shine");
	//		System.out.println("1 arg constructor");
	//	}
	//	Sccoty(int bikeNum,String Name){
	//		this(bikeNum,Name,"2.0");
	//		System.out.println("2 arg constructor");
	//	}
	//	Sccoty(int bikeNum,String Name,String model){
	//		this(bikeNum,Name,model,"Hero Honda");
	//		System.out.println("3 arg constructor");
	//	}
	//	Sccoty(int bikeNum,String Name,String model,String brand){
	//		this(bikeNum,Name,model,brand,"Red");
	//		System.out.println("4 arg constructor");
	//	}
	//	Sccoty(int bikeNum,String Name,String model,String brand,String color){
	//		this.bikeNum=bikeNum;
	//		this.Name=Name;
	//		this.model=model;
	//		this.brand=brand;
	//		this.color=color;
	//		System.out.println("5 arg constructor");
	//	}
	//	{
	//		System.out.println("Instance block Created In Child Class");
	//		System.out.println("---------------------------------");
	//	}
		
	//}

	public static void main(String[] args) {
		System.out.println("---------------------------------");
		Bike A=new Bike();
		A.bikeinfo();
		System.out.println("----------------------------------");
	}
	void bikeinfo() {
		//System.out.println("Number of the bike:"+this.bikeNum);
		//System.out.println("Number of the bike:"+this.Name);
		//System.out.println("Number of the bike:"+this.model);
		//System.out.println("Number of the bike:"+this.brand);
		//System.out.println("Number of the bike:"+this.color);
		System.out.println("Number of the bike:"+this.bikeNum);
		System.out.println("Number of the bike:"+this.Name);
		System.out.println("Number of the bike:"+this.model);
		System.out.println("Number of the bike:"+this.brand);
		System.out.println("Number of the bike:"+this.color);
		
	}

}
