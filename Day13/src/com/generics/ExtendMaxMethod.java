package com.generics;
import java.util.Arrays;
public class ExtendMaxMethod<Z extends Comparable<Z>> {
		Z[] elements;

		public ExtendMaxMethod(Z[] elements) {
			this.elements = elements;
			testMaximum(elements);
		}
		public static <Z extends Comparable<Z>> void testMaximum(Z[] elements) {
				Arrays.sort(elements);
			printMax(elements[elements.length - 1]);
		}
	public static <Z> void printMax(Z max) {
			System.out.println(max + " is the largest element");
		}

		public static void main(String[] args) {

			Integer[] intelements = { 12, 34, 23, 89, 78 };
			new ExtendMaxMethod(intelements);
			Float[] floatelements = { 5.6f, 15.56f, 32.7f, 121.23f, 67.32f };
			new ExtendMaxMethod(floatelements);
			String[] values = { "Apple", "Peach", "Banana", "Mango", "Gauva" };
			new ExtendMaxMethod(values);
		}
	}
