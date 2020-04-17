package VPL_programming_exercises_09_04_2020;

/*
 * CS162-Introduction to Computer Science II VPL_Exercises_from_Lab_2_to_Lab_3
 * Mengyu Rao
 * 2020.4.8
 * HF.China
 */

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double side1 = sc.nextDouble();//input a side
		double side2 = sc.nextDouble();//input a side
		double side3 = sc.nextDouble();//input a side
		if ((side1 + side2) <= side3 || (side1 + side3) <= side2 || (side2 + side3) <= side1) {//This is not a triangle
			System.out.println("This is not a triangle.");
		} else {
			if (side1 == side2 && side2 == side3) { //This is an equilateral triangle.
				System.out.println("This is an equilateral triangle.");
			} else if (side1 == side2 || side2 == side3 || side1 == side3) { //This is an equilateral triangle.
				System.out.println("This is an isosceles triangle.");
			} else { //This is a scalene triangle.
				System.out.println("This is a scalene triangle.");
			}
		}
	}

}
