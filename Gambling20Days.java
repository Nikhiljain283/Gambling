package com.gambling;

public class Gambling20Days {
	public static void main(String[] args) {
		int stake = 100;
		int bet = 1;
		int days = 20;
		int win = 0;
		int loose = 0;

		for (int i = 1; i <= days; i++) {
			System.out.println("day " + i);
			stake = 100;
			while (stake < 150 && stake > 50) {
				int check = (int) (Math.random() * 2);
				if (check == 0) {
					stake++;
				} else {
					stake--;
				}
			}
			System.out.println("stake : " + stake);
			if (stake == 150) {
				win++;
			} else {
				loose++;
			}
		}
		System.out.println("Number of days won : " + win);
		System.out.println("Number of days loose : " + loose);
		int winAmount = win * 50;
		int looseAmount = loose * 50;
		System.out.println("Amount won : " + winAmount);
		System.out.println("Amount lost : " + looseAmount);
	}
}