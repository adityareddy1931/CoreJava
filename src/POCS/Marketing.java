package POCS;

import java.util.Scanner;

public class Marketing {
	static void Marketing() {
		String YorN;
		double totalCost = 0;
		do {
			Scanner Sc = new Scanner(System.in);
			System.out.println("In which catg your Searching");
			String catg = Sc.nextLine().toLowerCase();
			switch (catg) {
			case "fruits":
				do {
					System.out.println("Enter the name of the fruit");
					String Fruit = Sc.nextLine().toLowerCase();
					switch (Fruit) {
					case "mango":
						System.out.println("The cost ot the kg mango is 50");
						int MangoCost = 50;
						totalCost = totalCost + MangoCost;
						break;
					case "apple":
						System.out.println("The cost ot the kg mango is 60");
						int AppleCost = 60;
						totalCost = totalCost + AppleCost;
						break;
					case "banana":
						System.out.println("The cost ot the kg mango is 70");
						int BananaCost = 70;
						totalCost = totalCost + BananaCost;
						break;
					case "graps":
						System.out.println("The cost ot the kg mango is 80");
						int GrapsCost = 80;
						totalCost = totalCost + GrapsCost;
						break;
					case "orange":
						System.out.println("The cost ot the kg mango is 90");
						int OrangeCost = 90;
						totalCost = totalCost + OrangeCost;
						break;
					default:
						System.out.println("Enter item is not Availble");
						break;
					}
					System.out.println("Are you want to continoue:");
					YorN = Sc.nextLine();

				} while (YorN.equalsIgnoreCase("y"));
				break;
			case "vegtables":
				do {
					System.out.println("enter the Name of vegtables");
					String vegtable = Sc.nextLine().toLowerCase();
					switch (vegtable) {
					case "tomato":
						System.out.println("The cost ot the kg tomato is 50");
						int tomatoCost = 50;
						totalCost = totalCost + tomatoCost;
						break;
					case "ladiesfinger":
						System.out.println("The cost ot the kg ladiesfinger is 60");
						int ladiesfingerCost = 60;
						totalCost = totalCost + ladiesfingerCost;
						break;
					case "brinjal":
						System.out.println("The cost ot the kg brinjal is 70");
						int brinjalCost = 70;
						totalCost = totalCost + brinjalCost;
						break;
					case "beetroot":
						System.out.println("The cost ot the kg beetroot is 80");
						int beetrootCost = 80;
						totalCost = totalCost + beetrootCost;
						break;
					case "carrot":
						System.out.println("The cost ot the kg carrot is 90");
						int carrotCost = 90;
						totalCost = totalCost + carrotCost;
						break;
					default:
						System.out.println("Enter item is not Availble");
						break;
					}
					System.out.println("Are you want to continoue");
					YorN = Sc.nextLine();
				} while (YorN.equalsIgnoreCase("y"));
				break;
				default:System.out.println("invalid catg");
			}
			System.out.println("Are you want to continoue");
			YorN = Sc.nextLine();
		} while (YorN.equalsIgnoreCase("y"));
		System.out.println("The total cost is:"+totalCost);
		System.out.println("You are Exited");
	}

	public static void main(String[] args) {
		System.out.println("Welcome To the hyper Market");
		Marketing();
	}
}