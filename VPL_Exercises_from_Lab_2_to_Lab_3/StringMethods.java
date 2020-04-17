package VPL_Exercises_from_Lab_2_to_Lab_3;

/*
 * CS162-Introduction to Computer Science II VPL_Exercises_from_Lab_2_to_Lab_3
 * Mengyu Rao
 * 2020.4.7
 * HF.China
 */

public class StringMethods {

	public static void main(String[] args) {
		String str = "Most guitars have six strings.";
		int length = str.length();// the length of the String
		int index = str.indexOf('h');// the position of the first occurrence of the character 'h'
		String str1 = str.toLowerCase();// the String in all lower case characters
		String str2 = str.toUpperCase();// the String in all upper case characters
		// Print the length of the String on a new line.
		System.out.println("String Length: " + length);
		// Print the position of the first occurrence of the character 'h' on a new line.
		System.out.println("Position of first 'h': " + index);
		// Print to the screen the String in all lower case characters on a new line.
		System.out.println(str1);
		// Print to the screen the String in all upper case characters on a new line.
		System.out.println(str2);
	}
}
