package com.greatlearning.paymoney;

import java.util.Scanner;

public class PayMoney {

	private int size;
	private int transactions[];
	private int targetNo;

	public void checkTargetAchievability() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array:");
		size = sc.nextInt();
		transactions = new int[size];
		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {
			transactions[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved");
		targetNo = sc.nextInt();
		while (targetNo-- != 0) {
			int flag = 0;
			int target;
			System.out.println("Enter the value of target");
			target = sc.nextInt();
			long totalTarget = 0;
			for (int i = 0; i < size; i++) {
				totalTarget += transactions[i];
				if (totalTarget >= target) {
					System.out.println("Target Acvhived in " + (i + 1) + "transactions");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achived");
			}
		}
		sc.close();
	}
}