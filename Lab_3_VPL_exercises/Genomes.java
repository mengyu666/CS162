package Lab_3_VPL_exercises;

import java.util.Scanner;

public class Genomes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();// accepts a String as a parameter
		if (check(s)) { //call check method from the main method
			System.out.println("true");  //the String taken as a parameter contains just the genome's characters
		} else {
			System.out.println("false");//the String taken as a parameter contains just not the genome's characters
		}
	}
    //check method
	public static boolean check(String s) {
		// if the String taken as a parameter contains just the genome's characters or not
		boolean ifContain = s.matches("[cgat]*");//
		return ifContain;

	}

}
