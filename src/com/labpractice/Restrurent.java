package com.labpractice;

public class Restrurent {
	static String restrurentName="aditya";
	int tableNo=120;
	int numOfSeats=4;
	boolean reserved=false;
	void reserveTable() {
		reserved=true;
		System.out.println("the table reservation status:"+reserved);
		
	}
	void cancelReservation() {
		reserved=false;
		System.out.println("the reservation status after the canclation:"+reserved);
		
	}
	void displayTableDetails() {
		System.out.println("name of restrurent:"+restrurentName);
		System.out.println("name of table:"+tableNo);
		System.out.println("no of seat there:"+numOfSeats);
		System.out.println("status of reservation:"+reserved);
		
		
	}
	static void  changeRestruentName() {
		restrurentName="sunil";
		System.out.println("the changed restrurent name is :"+restrurentName);
		
	}
	static void displayRestrurentName() {
		
		changeRestruentName();
	}
	

	public static void main(String[] args) {
		
		Restrurent A=new Restrurent();
		A.displayTableDetails();
		A.reserveTable();
		A.cancelReservation();
		A.displayRestrurentName();
	}

}
