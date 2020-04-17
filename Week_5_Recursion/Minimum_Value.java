package Week_5_Recursion;
/*
 * rmy
 * 2020/3/6
 */
import java.util.*;

public class Minimum_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=0;
		n=sc.nextInt();
		int array[]=new int [n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();		
		}
		System.out.println(q1Iterative(array));
		System.out.println(q1Recursive(array,0));
		
	}
	public static int q1Iterative(int []a) {
		int min=Integer.MAX_VALUE;
		int n=a.length;
		for(int i=0;i<n;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}
	public static int q1Recursive(int a[],int start) {
		if(start==a.length-1) {
			return a[start];
		}else {
			return (Math.min(a[start],q1Recursive(a, start+1) ));
		}
	}
}
