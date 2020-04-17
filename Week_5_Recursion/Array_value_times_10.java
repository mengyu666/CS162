package Week_5_Recursion;

import java.util.Scanner;
	
public class Array_value_times_10 {
//	public static boolean flag;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=0;
		n=sc.nextInt();
		int array[]=new int [n];
		
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		int index=sc.nextInt();
		if(checkArray(array,index)) {
		System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

	public static boolean checkArray(int[] array, int index) {		
			if(index>=array.length-1||array.length==1) {
				return false;
			}
			if(array[index+1]==10*array[index]) {
				return true;
			}else {
				return checkArray(array,index+1);
			}	
		
	}

}
