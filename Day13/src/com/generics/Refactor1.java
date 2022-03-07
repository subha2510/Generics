package com.generics;
import java.util.Scanner;

public class Refactor1<Z extends Comparable<Z>> {
	Z first, second, third;

	public Refactor1(Z first, Z second, Z third) {
		this.first = first;
		this.second = second;
		this.third = third;
		testMaximum(first, second, third);
	}
	public static <Z extends Comparable<Z>> void testMaximum(Z first, Z second, Z third) {
		Z maximum = first;
		if (second.compareTo(maximum) > 0)
			maximum = second;
		if (third.compareTo(maximum) > 0)
			maximum = third;
		System.out.println(maximum);

	}

	public static void main(String[] args) {

		new Refactor1(23, 48, 62);
		new Refactor1("Mango", " Strawberry", "Banana");
		new Refactor1(1.6, 11.7, 110.3);
	}
}