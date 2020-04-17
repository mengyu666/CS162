package Lab_1;

/*
 * CS162-Introduction to Computer Science II new Lab1
 * Mengyu Rao
 * 2020.3.23
 * HF.China
 */
import java.util.Scanner;

public class DoubleSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b = 0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();// input a single integer
		b = sc.nextDouble();// input a single integer
		determineSize(a, b); // call determineSize() method from the main method
	}

	// determineSize() method
	public static void determineSize(double a, double b) {
		if (a < b) { 
			System.out.println("Largest = "+b);
			System.out.println("Smallest = "+a);
		} else if (a > b) { 
			System.out.println("Largest = "+a);
			System.out.println("Smallest = "+b);
		} else { 
			System.out.println("Numbers are the same.");
		}
	}
}
