package com.constructors;

public class User {
	String name;
	String area;
       User(){
// it calling the parameterized constructor -Excution moves to the( PC)
    	   this("Aditya","Kakinada");
    	   
       }
       User(String name,String area){
    	   
    	   this.name=name;
    	   this.area=area;
    	   System.out.println("Parameterized Constructor iS called");
       }
       void display() {
    	   System.out.println("------------------------------------");
    	   System.out.println("Name of the Coder:"  + name);
    	   System.out.println("Area of the Coder:"  + area);
       }
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("------------------------------------");
		User A=new User();
		A.display();

	}

}
