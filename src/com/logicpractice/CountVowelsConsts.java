package com.logicpractice;

public class CountVowelsConsts {
	void display() {
	String s="aditya";
	int num=s.length();
	int vowelcount=0;
	int constcount=0;
	for(int i=0;i<num;i++) {
		char ch=s.charAt(i);
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			vowelcount+=1;
			//	System.out.println(ch);
		}
		else {
			constcount+=1;
			//System.out.println(ch);
		}
	}
	System.out.println("vowels="+vowelcount);
	System.out.println("consonents="+constcount);
	System.out.println("total letters="+(vowelcount+constcount));
	}

	public static void main(String[] args) {
		CountVowelsConsts A= new CountVowelsConsts();
		A.display();
		
	}

}
