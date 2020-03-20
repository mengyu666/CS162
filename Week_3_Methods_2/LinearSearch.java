package Week_3_Methods_2;

/*
 * CS162-Introduction to Computer Science II Lab2
 * Mengyu Rao
 * 2020.3.19
 * HF.China
 */

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n = 0, x = 0; 
		n = sc.nextDouble(); // input a single double
		double array[] = new double[(int) n]; //
		for (int i = 0; i < n; i++) {  //  create a double array
			array[i] = sc.nextDouble();
		}
		x = sc.nextDouble(); // input a single double
		boolean iffind = findElement(array, x); // call the findElement() method from the main method
		if (iffind) {
			System.out.println(x + " was found in the array");
		} else {
			System.out.println(x + " was NOT found in the array");
		}
	}
	
	//findElement() method
	public static boolean findElement(double array[], double x) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == x) {
				return true;
			}
		}
		return false;
	}

}
