package com.constructors;
public class MovieTheater{
    String movieName;
    String language;
    double ticketprice;
    MovieTheater(String movieName,String language,double ticketprice){
        this.movieName=movieName;
        this.language=language;
        this.ticketprice=ticketprice;
        
    }
    MovieTheater( MovieTheater mt,double ticketprice){
        this.movieName=mt.movieName;
        this.language=mt.language;
        this.ticketprice=ticketprice;
        
    }
    public static void main(String [] args){
        MovieTheater mt = new MovieTheater("bichagaddu","Telugu",150.00);
        MovieTheater mt1 = new MovieTheater( mt,200);
        
        mt.show();
        mt1.show();
        
    }
    void show(){
    System.out.println( "Name of movie:"+movieName);
    System.out.println("Language of the movie:"+language);
    System.out.println("Ticket price:" +ticketprice);
    System.out.println("****************************" );
    }
}