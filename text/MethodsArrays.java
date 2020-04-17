package text;

import java.util.Scanner;

public class MethodsArrays {
	 static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		double Average=0;
		int array[]=new int[100];
		
		fillArray(array,n);
		int sum=sumArray(array,n);
		Average=avgArray(array,n);
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+Average);
		printArray(array,n);
	}
	public static void fillArray(int array[], int n ){

		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
	}
	public static int sumArray(int array[],int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=array[i];
		}
		return sum;
	}
	public static double avgArray(int array[],int n) {
		double sum=0;
		for(int i=0;i<n;i++) {
			sum+=array[i];
		}
		return sum/n;
	}
	public static void printArray(int array[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(array[i]);
			if(i<n-1) {
				System.out.print(" ");
			}
		}
	}
}