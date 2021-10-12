package com.bridgelabz;

public class Maximum {
	public static Float maxOfFloat(Float f1, Float f2, Float f3) {
		Float max = f1;
		if (f2.compareTo(max) > 0)
			max = f2;
		if (f3.compareTo(max) > 0)
			max = f3;
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Find Maximun Problem Using Generics \n");
		System.out.println("The maximum value between the three float is : " + maxOfFloat(1.5f, 3.56f, 5.87f));
	}

	@SuppressWarnings("unused")
	private static String maxOfInteger (int i, int j, int k) {
		System.out.println("Welcome To Find Maximun Problem Using Generics \n");
		System.out.println("The maximum value between the three integer is : " + maxOfInteger(3, 8, 5));
		System.out.println("The maximum value between the three integer is : " + maxOfInteger(3, 8, 5)+ "\n");
		return null;
	}
}


