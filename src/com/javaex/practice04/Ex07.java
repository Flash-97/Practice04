package com.javaex.practice04;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		int money;
		
		Scanner sc = new Scanner(System.in);
		
		int[] wonmoney = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int count[] = new int[10];
		
		System.out.print("금액: ");
		money = sc.nextInt();
		
		for(int i = 0; i<wonmoney.length; i++) {
			count[i] = money/wonmoney[i];  //변환
			money -= count[i]*wonmoney[i]; //잔돈
			
			if (wonmoney[i]>500) {
				System.out.println(wonmoney[i]+"원: " + count[i] + "장");
			} 
			else {
				System.out.println(wonmoney[i]+"원: " + count[i] + "개");
			}
		} 
		
		
	
			
		
	}

}
