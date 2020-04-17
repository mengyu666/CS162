package VPL_programming_exercises_09_04_2020;

/*
 * CS162-Introduction to Computer Science II VPL_Exercises_from_Lab_2_to_Lab_3
 * Mengyu Rao
 * 2020.4.8
 * HF.China
 */

import java.util.Scanner;

public class DotProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int array1[] = new int[5];
		int array2[] = new int[5];
		for (int i = 0; i < 5; i++) { // input the first array
			array1[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++) { // input the second array
			array2[i] = sc.nextInt();
		}
		int dotproduct = calcDP(array1, array2); // call calcDP method from the main method
		System.out.println("The dot product is " + dotproduct);
	}

	// calcDP method
	public static int calcDP(int[] array1, int[] array2) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += array1[i] * array2[i];
		}
		return sum;
	}

}
