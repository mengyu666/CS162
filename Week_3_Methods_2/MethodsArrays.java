package Week_3_Methods_2;

/*
 * CS162-Introduction to Computer Science II Lab2
 * Mengyu Rao
 * 2020.3.19
 * HF.China
 */

import java.util.Scanner;

public class MethodsArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		double Average = 0;

		int array[] = fillArray(); // call the fillArray() method from the main method
		sum = sumArray(array);// call the sumArray() method from the main method
		Average = avgArray(array);// call the avgArray() method from the main method

		System.out.println("Sum = " + sum);
		System.out.println("Average = " + Average);
		printArray(array);
	}

	// fillArray() method
	public static int[] fillArray() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // take in a number representing the length of the array
		int array[] = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();

		}
		return array;
	}

	// sumArray() method
	public static int sumArray(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	// avgArray() method
	public static double avgArray(int array[]) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}

	// printArray() method
	public static void printArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}
	}
}
