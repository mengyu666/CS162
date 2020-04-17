package VPL_Exercises_from_Lab_2_to_Lab_3;

/*
 * CS162-Introduction to Computer Science II VPL_Exercises_from_Lab_2_to_Lab_3
 * Mengyu Rao
 * 2020.4.7
 * HF.China
 */

public class Multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i <= 100) { //loop from number 0 to number 100
			if (i % 5 == 0 && i % 7 == 0) {  //num is a multiple of 5 and 7
				System.out.println(i + " is a multiple of 5 and 7");
			} else if (i % 5 == 0 || i % 7 == 0) {  //num is a multiple of 5 and 7
				System.out.println(i + " is a multiple of 5 or 7");
			}
			i++; //increase i by one
		}
	}

}
