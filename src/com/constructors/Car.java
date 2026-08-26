package com.constructors;

public class Car {

	int carNum;
	String carModel;
	String onwerName;
	String Brand;

	Car(){
		System.out.println(" no arg const");
		carNum=3456;
		carModel="benz1234";
		onwerName="mahesh babu";
		Brand="benzz";
		
	}

	Car(int carNum,String carModel,String onwerName,String Brand){
		System.out.println(" 4 arg const");
		//this keyword is used to invoke the current class data models,by the reference of the 
		this.carNum=carNum;
		this.carModel=carModel;
		this.onwerName=onwerName;
		this.Brand=Brand;
	}
	Car(int carNum,String carModel){
		System.out.println(" 2 arg const");
		this.carNum=carNum;
		this.carModel=carModel;
	}
	void display() {
		System.out.println(carNum);
		System.out.println(carModel);
		System.out.println(onwerName);
		System.out.println(Brand);
		System.out.println("*******************************");
	}
	public static void main(String []args) {
		Car A=new Car();
		A.display();
		Car B=new Car(3333,"benz12345","aditya","benzz");
		B.display();
		Car C=new Car(3333,"single gear");
		C.display();
	}
	
}