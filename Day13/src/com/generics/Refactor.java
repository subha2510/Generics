package com.generics;
import java.util.Scanner;
public class Refactor {

	public static <Z extends Comparable<Z>> Z findMaximum(Z first, Z second, Z third) {
		Z maximum = first;
		if (second.compareTo(maximum) > 0)
			maximum = second;
		if (third.compareTo(maximum) > 0)
			maximum = third;
		return maximum;
	}
	public static void main(String[] args) {

		Integer num1 = 78, num2 = 89, num3 = 110;
		System.out.println("Maximum value of three Integer Variables :" + findMaximum(num1, num2, num3));
		Float f1 = 63.45f, f2 = 105.32f, f3 = 32.96f;
		System.out.println("Maximum value of three Float Variables :" + findMaximum(f1, f2, f3));
		String name1 = "Apple", name2 = "Mango", name3 = "Banana";
		System.out.println("Maximum value of three String Variables :" + findMaximum(name1, name2, name3));
	}
}