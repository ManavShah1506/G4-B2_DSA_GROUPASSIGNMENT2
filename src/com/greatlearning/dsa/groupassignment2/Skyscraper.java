package com.greatlearning.dsa.groupassignment2;
import java.util.*;

public class Skyscraper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of floors in the building: ");
		int n = sc.nextInt();
		int i;
		int[] floors = new int[n];
		for (i = 0; i < n; i++) {
			System.out.println("Enter the floor size given on day " + (i+1) + ": ");
			floors[i] = sc.nextInt();
		}

		Stack<Integer> skyscraper = new Stack<>();
		for (i = 0; i < n; i++) {
			int currentFloor = floors[i];
			while (!skyscraper.isEmpty() && skyscraper.peek() >= currentFloor) {
				System.out.print(skyscraper.pop() + " ");
			}
			System.out.println();
			System.out.println("Day " + (i+1) + ": ");
			skyscraper.push(currentFloor);
		}

		while (!skyscraper.isEmpty()) {
			System.out.print(skyscraper.pop() + " ");
		}
	}
}
