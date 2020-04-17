package Lab_1;

/*
 * CS162-Introduction to Computer Science II Lab1
 * Mengyu Rao
 * 2020.3.12
 * HF.China
 */
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner sc = new Scanner(System.in);
//		try {
		while(sc.hasNext()) {
			num = sc.nextInt();
			// n is a negative number
			if (num < 0) {
				System.out.println("Not a valid entry!");
				System.exit(0);
			}
			// call isEven() method from the main method, and return a boolean value
			boolean isEven = isEven(num);
//			boolean isEven = isEven(10);
			if (isEven) {  //true
				System.out.println("Even");
			} else {    //false
				System.out.println("Odd");
			}
			
			
//		} catch (Exception e) { // n is not a number
//			System.out.println("Not a valid entry!");
//		}
		}
	}

	// isEven() method
	public static boolean isEven(int n) {
		if ((n & 1) == 1) { // n%2==1// n is an odd number, return false
			return false;
		} else { // n is an even number, return true
			return true;
		}
	}
}
