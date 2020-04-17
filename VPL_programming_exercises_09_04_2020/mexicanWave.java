package VPL_programming_exercises_09_04_2020;

/*
 * CS162-Introduction to Computer Science II VPL_Exercises_from_Lab_2_to_Lab_3
 * Mengyu Rao
 * 2020.4.8
 * HF.China
 */

import java.util.Scanner;

public class mexicanWave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();// input a string
		String array[] = wave(str);// call the wave() method from the main method
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// wave() method
	public static String[] wave(String str) {
		int sum = 0;
		// count how many characters, ignore the space
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				sum++;
		}
		String array[] = new String[sum];// create a new string array
		// i is the index of character in the input string
		// j is the index in the new string array
		for (int i = 0, j = 0; j < str.length() && i < str.length(); j++, i++) {
			if (str.charAt(i) == ' ') { // Spaces are ignored in the mexican wave.
				j--;
				continue;
			} else { // create the new string
				String s = "";
				s += str.substring(0, i);
				s += (char) (str.charAt(i) - ('a' - 'A')); // change LowerCase letter to UpperCase letter
				s += str.substring(i + 1, str.length());
				array[j] = s;
			}
		}
		return array;
	}

}
