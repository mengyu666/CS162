package VPL_Exercises_from_Lab_2_to_Lab_3;

/*
 * CS162-Introduction to Computer Science II VPL_Exercises_from_Lab_2_to_Lab_3
 * Mengyu Rao
 * 2020.4.7
 * HF.China
 */

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vowelCount = 0; // the number of vowel in the string
		int novowelCount = 0; // the number of non vowels in the string
		char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
		String check = "programming"; // store String in a variable named check and assign it the value "programming"
		for (int i = 0; i < check.length(); i++) { // to check every character in the string
			if (itisvowel(check.charAt(i), vowels)) { // call itisvowel() method from the main method
				vowelCount++; // the character in the string is a vowel
			} else {
				novowelCount++; // the character in the string is not a vowel
			}
		}
		System.out.println(vowelCount + " vowels " + novowelCount + " non vowels ");
	}

	// itisvowel() method
	public static boolean itisvowel(char charAt, char vowels[]) {
		for (int i = 0; i < 4; i++) {
			if (charAt == vowels[i]) {
				return true; // the character in the string is a vowel
			}
		}
		return false; // the character in the string is not a vowel
	}

}
