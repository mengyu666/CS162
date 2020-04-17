package VPL_Exercises_from_Lab_2_to_Lab_3;

/*
 * CS162-Introduction to Computer Science II VPL_Exercises_from_Lab_2_to_Lab_3
 * Mengyu Rao
 * 2020.4.7
 * HF.China
 */

import java.util.Scanner;

public class SmallerNumbers {
	
	public static int num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] array = new double[10];
		for (int i = 0; i < 10; i++) { //Asks the user to enter 10 numbers
			array[i] = sc.nextDouble();
		}
		checkSmallerNumbers(array, 0, 1); //Call checkSmallerNumbers() from main method
		System.out.println("A smaller number was entered after a larger number "+num+" times.");
	}
	//checkSmallerNumbers() method
	public static void checkSmallerNumbers(double[] array, int i, int j) {
		if (j == array.length) return;
		//Compare two adjacent numbers
		if (array[i] > array[j]) { //A smaller number was entered after a larger number
			num++;
		}
		checkSmallerNumbers(array, i + 1, j + 1); // Recursive call method
	}

}
