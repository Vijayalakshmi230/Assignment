package day3;

import java.util.Scanner;

interface Food {
	void food();
}

class TraditionalFood implements Food {
	public void food() {
		System.out.println("Delivering Traditional Food");
	}
}

class WesternFood implements Food {
	public void food() {
		System.out.println("Delivering Western Food");
	}
}

public class p2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Food Type:");
		System.out.println("1. Traditional Food");
		System.out.println("2. Western Food");
		int choice = sc.nextInt();
		if (choice == 1) {
			Food s1 = new TraditionalFood();
			s1.food();
		} else if (choice == 2) {
			Food s2 = new WesternFood();
			s2.food();
		} else {
			System.out.println("Invalid choice");
		}
	}
}
