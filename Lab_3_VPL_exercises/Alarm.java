package Lab_3_VPL_exercises;

/*
 * CS162-Introduction to Computer Science II Lab 3 VPL Exercises
 * Mengyu Rao
 * 2020.4.16
 * HF.China
 */
import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String password = sc.next();// input password
		gen(password);// call the gen method from the main method
	}

	// gen() method
	public static void gen(String password) {
		boolean check = password.matches(".*1234.*");//if the string contains 1234
		if (password.length() > 10 || !check) { // if the length of string larger than 10
			System.out.println("Alarm Activated");
		} else { // if contains 1234
			System.out.println("Alarm Deactivated");
		}
	}
}
