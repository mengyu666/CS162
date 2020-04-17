package VPL_Exercises_from_Lab_2_to_Lab_3;

/*
 * CS162-Introduction to Computer Science II VPL_Exercises_from_Lab_2_to_Lab_3
 * Mengyu Rao
 * 2020.4.7
 * HF.China
 */

public class WellOrdered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q = 0;
		// prints all well-ordered three-digit numbers
		for (int i = 1; i <= 7; i++) {
			for (int j = i + 1; j <= 8; j++) {
				for (int k = j + 1; k <= 9; k++) {
					q++;
					System.out.print(i * 100 + j * 10 + k + " ");
					if (q > 10) {
						System.out.println();
						q = 0;
					}
				}
			}
		}
	}
}
