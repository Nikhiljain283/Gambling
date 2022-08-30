package com.gambling;

public class GamblerResign {
	public static void main(String[] args) {
		int stake = 100;
		int bet = 1;
		
		while(stake < 150 && stake > 50) {
		int check = (int)(Math.random()*2);
		if(check == 0) {
			stake++;
			System.out.println("gambler win");
			System.out.println("stake : "+stake);
		}else {
			stake--;
			System.out.println("gambler loose");
			System.out.println("stake : "+stake);
		}
		}
	}
}

