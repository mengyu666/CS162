package Lab_1;

/*
 * CS162-Introduction to Computer Science II Lab1
 * Mengyu Rao
 * 2020.3.12
 * HF.China
 */
import java.util.Scanner;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// input a single integer
		printStarTriangle(n); // call printStarTriangle() method from the main method
	}

	// a method called printStarTriangle()
	public static void printStarTriangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
