package Week8_Class_and_Object;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// x and y is the search range
		int x = sc.nextInt();
		int y = sc.nextInt();
		int num = sc.nextInt();// The number being searched for
		int i = 0;// the number of tries to find it
		int left = x;
		int right = y;
		// BinarySearch Algorithm
		while (left <= right) {
			i++;
			int mid = (right - left) / 2 + left;
//			System.out.println(mid);
			if (num == mid) {
				break;
			} else if (num < mid) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		System.out.println("The number is: " + num);
		System.out.println("It took " + i + " tries!");
	}

}
