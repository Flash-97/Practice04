package com.javaex.practice04;

public class Ex01 {

	//3
	//7
	//12
	//0
	//0
	public static void main(String[] args) {

		int[] intArray = new int[5];
		intArray[0] = 3;
		intArray[1] = 7;
		intArray[2] = 12;
		
		int result = 0;
		
		for (int i=0; i< intArray.length; i++) {
			result = result + intArray[i];
		}
		System.out.println(result);
	}

}
