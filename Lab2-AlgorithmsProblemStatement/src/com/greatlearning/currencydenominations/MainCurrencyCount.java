package com.greatlearning.currencydenominations;

import java.util.Scanner;

public class MainCurrencyCount {

	public static void main(String args[]) {
		int size;
		int denomination[];
		int amounttopaid = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		size = sc.nextInt();
		denomination = new int[size];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			denomination[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		amounttopaid = sc.nextInt();

		MergeSort msort = new MergeSort();
		NotesCount Ncount = new NotesCount();

		msort.sort(denomination, 0, denomination.length - 1);
		Ncount.notesCountImplimentation(denomination, amounttopaid);

		sc.close();
	}
}
