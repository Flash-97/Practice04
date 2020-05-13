package com.javaex.practice04;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		double sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		for (int i = 0; i<num.length; i++) {
			System.out.print("숫자: ");
			num[i] = sc.nextInt();
			sum = sum+num[i];
			
		}
		System.out.println("평균은 " + (sum/num.length) + " 입니다.");
		
		
		
		
		sc.close();
	}

}
