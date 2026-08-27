package com.constructors;

 class Vechile {
	String carname;
	String brand;
	String model;
	String electricapcity;

	Vechile(String Carname) {
		this.carname = Carname;
	}
	public static void main(String[] args) {
		
	}
}

class Cars extends Vechile {
	Cars(String carname, String model, String brand) {
		super(carname);
		this.model = model;
		this.brand = brand;
	}
}

class Electriccar extends Cars {

	Electriccar(String carname, String model, String brand, String electricapcity) {
		super(carname, model, brand);
		this.electricapcity = electricapcity;
	}

	public static void main(String[] args) {
		Electriccar A = new Electriccar("ELECTRIC SWIFT", "DESIRE", "SWIFT", "5HRS");
		A.display();
	}

	void display() {
		System.out.println("Name of the car:"+carname);
		System.out.println("Model:"+model);
		System.out.println("Brand:"+brand);
		System.out.println("Electric capacity is:"+electricapcity);
	}
}