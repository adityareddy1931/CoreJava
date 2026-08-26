package com.labpractice;

public class Nullfy {
	    protected void finalize() throws Throwable {
	        System.out.println("Object is garbage collected: ");
	    }
	    static void Aditya() {
	    	Nullfy obj4=new Nullfy();
	    
	    }
	public static void main(String[] args) {
		 Nullfy obj1=new Nullfy();
		 Nullfy obj2=new Nullfy();
         Nullfy obj3=new Nullfy();
         obj1=null;                //nullfy      
         System.out.println(obj1);
         new Nullfy();             //anonimus
         obj2=obj3;                //resigning
         Aditya();                 //reference
         System.gc();
    }   
	}


