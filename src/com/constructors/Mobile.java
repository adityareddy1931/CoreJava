package com.constructors;

public class Mobile {
     static int mobileId;
     static String Name;
     static String brand;
     Mobile(){
    	 System.out.println("--------No arg const--------");
    	 mobileId=12345;
    	 Name="iphone";
    	 brand="apple";
     }
     Mobile(int mobileId,String Name,String brand){
    	 
    	 System.out.println("---------arg const----------");
    	 this.mobileId=mobileId;
    	 this.Name=Name;
    	 this.brand=brand;
    	 
     }
     void display() {
    	 System.out.println("mobileId="+mobileId);
    	 System.out.println("Name="+Name);
    	 System.out.println("brand="+brand);
     }
	    
	public static void main(String[] args) {
		
      Mobile a=new Mobile();
      a.display();
      Mobile b=new Mobile(12345,"vivot4","vivo");
      b.display();
      Mobile c=new Mobile(12345,"vivot5","vivo");
      c.display();
      
	}

}
