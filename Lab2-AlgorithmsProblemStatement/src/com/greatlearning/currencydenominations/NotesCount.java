package com.greatlearning.currencydenominations;

public class NotesCount {
	public void notesCountImplimentation(int notes[], int amount) {
		int[] notecounter = new int[notes.length];
		for (int i = 0; i < notes.length; i++) {
			if (amount >= notes[i]) {
				notecounter[i] = amount / notes[i];
				amount = amount - notecounter[i] * notes[i];
			}

		}
		if (amount > 0) {
			System.out.println("Exact amount can't be given");

		} else {
			System.out.println("Your payment approach in order to give min no of notes will be");
		}
		for (int i = 0; i < notes.length; i++) {
			System.out.println(notes[i] + "No:Of notes is " + notecounter[i]);
		}

	}
}
