package com.labpractice;

public class StudentDate {
	static String collegeName=" ADITYA";
	int studentId;
	String studentName;
	int englishMarks;
	int teluguMarks;
	int hindiMarks;
	int totalMarks;
	double percentage;
	int totalSub;
	
	void calculateTotal() {
		  totalMarks =(englishMarks+teluguMarks+hindiMarks);
		System.out.println("total marks ="+totalMarks);
		}
	void calculatePercentage() {
		 percentage=totalMarks/totalSub;
		System.out.println("total percentage ="+percentage);
	}
	void displayStudent() {
		System.out.println();
		System.out.println();
		System.out.println("Total subjects have:"+ totalSub);
		calculateTotal();
		calculatePercentage();
		
	}

	public static void main(String[] args) {
		
		StudentDate A=new StudentDate();
		A. studentId=101;
		A.studentName="Aditya";
		A.englishMarks=76;
		A.teluguMarks=90;
	    A.hindiMarks=67;
	    A.totalSub=3;
	    A.displayStudent();
	}

}
