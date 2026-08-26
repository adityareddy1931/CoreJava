package com.constructors;

public class ObjCount {
	  static  int count;
	   ObjCount(){
		   count++;
	   }

	public static void main(String[] args) {
		
		ObjCount obj1=new ObjCount();
		ObjCount obj2=new ObjCount();
		ObjCount obj3=new ObjCount();
		ObjCount obj4 =new ObjCount();
		System.out.println(count);
	}

}
