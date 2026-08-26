package com.methods;

public class StudentData {
	int totalMarks(int totalmarks, int sub1, int sub2, int sub3, int sub4, int sub5, int sub6) {
		totalmarks = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6);
		return totalmarks;
	}

	double calculatePercentage(double marks, double totalMarks) {
		double totalPercentage = (marks / totalMarks) * 100;
		return totalPercentage;
	}
     String grade(double totalPercentage) {
    	if(totalPercentage>85) {
    		return "a";
    		
    	}
    	else if(totalPercentage>65 && totalPercentage<85 ) {
    		return "b";
    	}
    	else {
    		return "c";
    	}
    	
    }
     void StudentDataa(String name,int totalMarks,double TotalPercentage,String Grade) {
    	 System.out.println("name of the student:"+name);
    	 System.out.println("the total marks:"+totalMarks);
    	 System.out.println("the percentage:"+TotalPercentage);
    	 System.out.println("the grade:"+Grade);
     }
	public static void main(String[] args) {

		StudentData A = new StudentData();
		int result1 = A.totalMarks(66, 77, 88, 99, 88, 93, 98);
		double result2 = A.calculatePercentage(result1, 1000);
		A.grade(result2);
		A.StudentDataa("aditya", result1, result2,A.grade(result2));
		
		
	}
}