package com.merolina.currencyDenomination;

import java.util.Scanner;

import com.merolina.currencyDenomination.MergeSort;
import com.merolina.currencyDenomination.NotesCount;

public class travellerCurrencyApp {
	public static void main(String[] args) {
		System.out.println("Enter the size of currency denomination");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		MergeSort ms = new MergeSort();
		ms.sort(notes, 0, notes.length - 1);
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		NotesCount ns = new NotesCount();
		ns.notescounting(notes, amount);
	}
}
