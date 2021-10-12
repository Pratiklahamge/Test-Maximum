package com.bridgelabz;

public class FindMaxValue {

	public static Integer maxOfInteger(Integer a1, Integer a2, Integer a3){
		Integer max = a1;
		if (a2.compareTo(max) > 0)
			max = a2;
		if (a3.compareTo(max) > 0)
			max = a3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Find Maximun Problem Using Generics");
		System.out.println("Welcome To Find Maximun Problem Using Generics \n");
		System.out.println("The maximum value between the three integer is : " + maxOfInteger(3, 8, 5));
	}

}

