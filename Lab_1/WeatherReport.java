package Lab_1;

/*
 * CS162-Introduction to Computer Science II Lab1
 * Mengyu Rao
 * 2020.3.12
 * HF.China
 */
import java.util.Scanner;

public class WeatherReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printWeatherReport(); // call printWeatherReport() method from the main method
	}

	// printWeatherReport() method
	public static void printWeatherReport() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();   // input a single integer
		if (x < 0 && x > 45) {   // range x<0&& x>45
			System.out.println("Not a valid number!");
		} else if (x >= 0 && x <= 8) {   // range x>=0&& x<=8
			System.out.println("It is cold outside, bring a jacket!");
		} else if (x >= 9 && x <= 16) {    // range x>=9&& x<=16
			System.out.println("The sun is coming out, and it is getting warmer");
		} else if (x >= 17 && x <= 32) {   // range x>=17&& x<=32
			System.out.println("Time to sit beside the pool and relax");
		} else {
			System.out.println("Too hot, can't move!");
		}
	}
}
