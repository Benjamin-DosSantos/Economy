package com.blackpensoftware.economy.core;

public class EconomyCore {
	public static void main(String[] args){
		int gold_baseamount = 1000;
		int gold_grade = 2;
		int grade_amount = 10000;
		int gold_amount = 900;
		int multi = 10;
		
		System.out.println(((gold_amount / multi) + gold_baseamount - gold_amount) + (gold_grade * grade_amount));
		
	}
}