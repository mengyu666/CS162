package Lab_1;

/*
 * CS162-Introduction to Computer Science II new Lab1
 * Mengyu Rao
 * 2020.3.23
 * HF.China
 */
import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// input a single integer
		int m = sc.nextInt();// input a single integer
		int min = n < m ? n : m;// get the minimum integer
		int max = n < m ? m : n;// get the maximum integer
		for (int i = min; i <= max; i++) {
			if (isitPrime(i)) { // call the isitPrime() method from the main method
				System.out.println(i);
			}
		}
	}

	// isitPrime() method
	public static boolean isitPrime(int num) {
	    if(num<=1) return false;
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
