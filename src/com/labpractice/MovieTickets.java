package com.labpractice;

public class MovieTickets {
   static String theatreName="v cube";
   String movieName="pokiri";
   int seatNo=5;
   boolean bokkinStatus=false;
   void display1() {
	   System.out.println("theater name="+theatreName);
	   System.out.println("movie name="+movieName);
	   System.out.println("booking status="+bokkinStatus);
	   System.out.println("seat having="+seatNo);
	   
   }
   void Customer1() {
	   movieName="pokiri";
	   seatNo--;
	   bokkinStatus=true;
	   System.out.println("theater name="+theatreName);
	   System.out.println("movie name="+movieName);
	   System.out.println("booking status="+bokkinStatus);
	   System.out.println("remaining seat having="+seatNo--);
	  
   }
   void bookingStatudsc1() {
	   bokkinStatus=false;
	   System.out.println("booking status="+bokkinStatus);
   }
   void Customer2() {
	   movieName="pokiri2";
	   seatNo--;
	   bokkinStatus=true;
	   System.out.println("theater name="+theatreName);
	   System.out.println("movie name="+movieName);
	   System.out.println("booking status="+bokkinStatus);
	   System.out.println("seat having="+seatNo);
	   
   }
   void bookingStatusc2() {
	   bokkinStatus=false;
	   System.out.println("booking status="+bokkinStatus);
	  
   }
   static void  changeThreaterName() {
	   theatreName="v cube jfs";
		System.out.println("changed theater name="+theatreName);
	   
   }
   void display11() {
	   Customer1();
	   bookingStatudsc1();
 }
   void display22() {
	   Customer2();
	   bookingStatusc2();
 }

  
   
   
	public static void main(String[] args) {
		MovieTickets A=new MovieTickets();
		A.display1();
		System.out.println("*******************************");
		A.display11();
		System.out.println("*******************************");
		A.display22();
		System.out.println("*******************************");
		changeThreaterName();
		
	}
	

}
