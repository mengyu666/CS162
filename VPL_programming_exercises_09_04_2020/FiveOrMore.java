package VPL_programming_exercises_09_04_2020;

/*
 * CS162-Introduction to Computer Science II VPL_Exercises_from_Lab_2_to_Lab_3
 * Mengyu Rao
 * 2020.4.8
 * HF.China
 */

import java.util.Scanner;

public class FiveOrMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String array[] = str.split(" ");// create an String array to store the word
		for (int i = 0; i < array.length; i++) {
			// find word in the String that has a length greater than five
			if (array[i].length() < 5) { // word in the String that has a length smaller than five
				System.out.print(array[i]);
			} else {// word in the String that has a length greater than five
				String newstr = reverse(array[i]); // call reverse method from the main method
				System.out.print(newstr);
			}
			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}
	}

	// reverse word
	public static String reverse(String str) {
		String newstr = "";// create a new string to store the reverse word
		for (int i = str.length() - 1; i >= 0; i--) { // reverse word
			newstr += str.charAt(i);
		}
		return newstr;
	}

}
