package com.constructors;

public class Varanasi {
	String MovieName;
	String Director;
	String Hero;
	String Heroien;
	String ReleaseDate;
	Varanasi(){
		this("Varanasi");
		System.out.println("No Argument Constructor Called From Parent");
	}
	Varanasi(String MovieName){
		this("Varanasi","Rajmouli");
		this.MovieName=MovieName;
		System.out.println("One Argument Constructor Called From Parent");
	}
	
	Varanasi(String MovieName,String Director){
		this("Varanasi","Rajmouli","Sir Mahesh Babu");
		this.MovieName=MovieName;
		this.Director=Director;
		System.out.println("Two Argument Constructor Called From Parent");
	}
	Varanasi(String MovieName,String Director,String Hero){
		this("Varanasi","Rajmouli","Sir Mahesh Babu","Chopraa");
		this.MovieName=MovieName;
		this.Director=Director;
		this.Hero=Hero;
		System.out.println("Three Argument Constructor Called From Parent");
	}
	Varanasi(String MovieName,String Director,String Hero,String Heroien){
		this("Varanasi","Rajmouli","Sir Mahesh Babu","Chopraa","7-04-2027");
		this.MovieName=MovieName;
		this.Director=Director;
		this.Hero=Hero;
		this.Heroien=Heroien;
		System.out.println("Four Argument Constructor Called From Parent");
	}
	Varanasi(String MovieName,String Director,String Hero,String Heroien,String ReleaseDate){
		this.MovieName=MovieName;
		this.Director=Director;
		this.Hero=Hero;
		this.Heroien=Heroien;
		this.ReleaseDate=ReleaseDate;
		System.out.println("Five Argument Constructor Called From Parent");
		
	}
	void display() {
		System.out.println("-------------------Parent Class data--------------------");
		System.out.println("Name of the Movie is:"+MovieName);
		System.out.println("Name of the Director is:"+Director);
		System.out.println("Name of the Hero is:"+Hero);
		System.out.println("Name of the Heroien is:"+Heroien);
		System.out.println("Name of the Realease Date is:"+ReleaseDate);
		
	}
	public static void main (String[]args) {
		
	}
	
}
class Pokiri extends Varanasi{
	String MovieName;
	String Director;
	String Hero;
	String Heroien;
	String ReleaseDate;
	Pokiri(){
		this("Pokiri");
		System.out.println("No Argument Constructor Called From Child");
	}
	Pokiri(String MovieName){
		this("Pokiri","Puri");
		this.MovieName=MovieName;
		System.out.println("One Argument Constructor Called From Child");
	}
	
	Pokiri(String MovieName,String Director){
		this("Pokiri","Puri","Sir Mahesh Babu");
		this.MovieName=MovieName;
		this.Director=Director;
		System.out.println("Two Argument Constructor Called From Child");
	}
	Pokiri(String MovieName,String Director,String Hero){
		this("Pokiri","puri","Sir Mahesh Babu","Ileana D'Cruz");
		this.MovieName=MovieName;
		this.Director=Director;
		this.Hero=Hero;
		System.out.println("Three Argument Constructor Called From Child");
	}
	Pokiri(String MovieName,String Director,String Hero,String Heroien){
		this("Pokiri","Puri","Sir Mahesh Babu","Ileana D'Cruz","Already released");
		this.MovieName=MovieName;
		this.Director=Director;
		this.Hero=Hero;
		this.Heroien=Heroien;
		System.out.println("Four Argument Constructor Called From Child");
	}
	Pokiri(String MovieName,String Director,String Hero,String Heroien,String ReleaseDate){
		this.MovieName=MovieName;
		this.Director=Director;
		this.Hero=Hero;
		this.Heroien=Heroien;
		this.ReleaseDate=ReleaseDate;
		System.out.println("Five Argument Constructor Called From Child");
	}
	
	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		Pokiri M=new Pokiri();
		M.display();
		System.out.println("---------------------------------------");
		
		

	}
	void display() {
		super.display();
		System.out.println("-------------------Child Class data---------------------");
		System.out.println("Name of the Director is:"+this.MovieName);
		System.out.println("Name of the Director is:"+this.Director);
		System.out.println("Name of the Hero is:"+this.Hero);
		System.out.println("Name of the Heroien is:"+this.Heroien);
		System.out.println("Name of the Realease Date is:"+this.ReleaseDate);
	}
}

