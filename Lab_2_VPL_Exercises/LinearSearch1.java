package Lab_2_VPL_Exercises;

/*
 * CS162-Introduction to Computer Science II Lab 2 VPL Exercises
 * Mengyu Rao
 * 2020.3.30
 * HF.China
 */
import java.util.Scanner;

public class LinearSearch1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double search = 0; 
		n = sc.nextInt(); // input a single double
		double array[] = new double[n]; 
		for (int i = 0; i < n; i++) {  //  create a double array
			array[i] = sc.nextDouble();
		}
		search = sc.nextDouble(); // input a single double
		boolean itisfind = findElement(array, search); // call the findElement() method from the main method
		if (itisfind) {
			System.out.println(search + " was found in the array");
		} else {
			System.out.println(search + " was NOT found in the array");
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

