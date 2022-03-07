package com.generics;
import java.util.Scanner;

public class Maximumfloat {
		static Scanner sc = new Scanner(System.in);
				public static void findMaxInt() {
			Integer x, y, z;
			System.out.println("Enter three Integers");
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
			Integer max = x;
			if (max.compareTo(y) < 0) {
				max = y;
			}
			if (max.compareTo(z) < 0) {
				max = z;
			}
			System.out.println(max);
		}
		public static void findMaxFloat() {
			Float x, y, z;
			System.out.println("Enter three Float values:");
			x = sc.nextFloat();
			y = sc.nextFloat();
			z = sc.nextFloat();
			Float max = x;
			if (max.compareTo(y) < 0) {
				max = y;
			}
			if (max.compareTo(z) < 0) {
				max = z;
			}
			System.out.println(max);
		}
		public static void main(String[] args) {

			findMaxInt();
			findMaxFloat();
		}
	}