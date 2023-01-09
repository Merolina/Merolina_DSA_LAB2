package com.merolina.DSAlab;

import java.util.Scanner;

public class PayMoneyApp {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the elements of Array");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(" Enter the number of targets to be achieved");
		int targetNumber = sc.nextInt();
		while (targetNumber-- != 0) {
			int flag = 0;
			long target;
			System.out.println("enter the value of target");
			target = sc.nextInt();
			long sum = 0;
			for (int i = 0; i < size; i++) {
				sum += a[i];
				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions ");
					flag = 1;
					break;

				}
			}
			if (flag == 0) {
				System.out.println(" Target is not achieved ");
			}

		}
	}
}
