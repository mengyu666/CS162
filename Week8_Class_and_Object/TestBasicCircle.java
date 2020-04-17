package Week8_Class_and_Object;

import java.util.Scanner;

public class TestBasicCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int radius1=sc.nextInt();
		int radius2=sc.nextInt();
		int radius3=sc.nextInt();
		BasicCircle bs1 = new BasicCircle (radius1);
		BasicCircle bs2 = new BasicCircle (radius2);
		BasicCircle bs3 = new BasicCircle (radius3);
		System.out.println("Circle1 has a radius of "+radius1);
		System.out.println("Circle2 has a radius of "+radius1);
		System.out.println("Circle3 has a radius of "+radius1);
		System.out.println("Circle1 has a circumference of "+bs1.getCircumference());
		System.out.println("Circle2 has a circumference of "+bs2.getCircumference());
		System.out.println("Circle3 has a circumference of "+bs3.getCircumference());
		System.out.println("Circle1 has a area of "+bs1.getArea());
		System.out.println("Circle2 has a area of "+bs2.getArea());
		System.out.println("Circle3 has a area of "+bs3.getArea());

	}

}
