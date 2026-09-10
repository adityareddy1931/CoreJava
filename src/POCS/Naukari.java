package POCS;

import java.util.Scanner;

public class Naukari {

	public static void main(String[] args) {
		System.out.println("Welcome To Aditya Job Check Portal");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String Name = sc.nextLine();
		System.out.println("Are you Are A Graduate");
		boolean IsGraduate = sc.nextBoolean();
		if (IsGraduate) {			
			System.out.println("Then Enter The Year of Graduate");
			int YearofPassOut = sc.nextInt();
			if (YearofPassOut >= 2024 && YearofPassOut <= 2027) {
				System.out.println("Your are elgibile for Apply  this Job");
				System.out.println("Enter the Percentage");
				double Percentage = sc.nextDouble();
				if (Percentage >= 80) {
					System.out.println("Enter your Work Experience if Any: ");
					double WorkExperence = sc.nextDouble();
					if (WorkExperence >=1) {
						System.out.println("Enter your Skill Set :");
						sc.nextLine();
						String Skills = sc.nextLine();
						if (Skills .equals("java full stack")  || Skills.equals("Mysql") 
								|| Skills.equals("backEnd Java")) {
							System.out.println("Enter the Expected Salary:");
							double salary = sc.nextDouble();
							if (salary >= 2500000) {
								System.out.println("Are you ok With to the Company Provided CTC");
								boolean Aggrement = sc.nextBoolean();
								if (Aggrement) {
									System.out.println("Your Eligible for this Application");
								} else {
									System.out.println("Your Not eligible");
								}
							} else {
								System.out.println("Your Not eligible,Due to we Cant providing that Much of CTC ");
							}
						} else {
							System.out.println("Your Not eligible");
						}
					} else {
						System.out.println("Your Not eligible");
					}
				} else {
					System.out.println("Your Not eligible");
				}
			}

			else {
				System.out.println(" Your Not eligible ");
			}
		} else {
			System.out.println(" Your Not eligible");
		}

	}

}
