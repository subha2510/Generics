package com.generics;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeParameters<Z extends Comparable<Z>> {
	Z[] elements;

	public ThreeParameters(Z[] elements) {
		this.elements = elements;
		testMaximum(elements);
	}
	public static <Z extends Comparable<Z>> void testMaximum(Z[] elements) {
		Arrays.sort(elements);
		
		System.out.println(elements[elements.length - 1] + " is the maximum");
	}
	public static void main(String[] args) {

		Integer[] intelements = { 12, 34, 23, 89, 78 };
		new ThreeParameters(intelements);
		Float[] floatelements = { 5.6f, 15.56f, 32.7f, 121.23f, 67.32f };
		new ThreeParameters(floatelements);
		String[] values= {"Apple","Peach","Banana","Mango","Gauva"};
		new ThreeParameters(values);
	}
}