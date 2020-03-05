package Week_2_Methods_I;

import java.util.Scanner;
//have some questions
public class WeatherReport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=0;
		x=sc.nextInt();
		WeatherReport me=new WeatherReport();
		me.printWeatherReport(x);	
	}
	private  void printWeatherReport(int x) {
		if(x<0&&x>45) {
			System.out.println("Not a valid number!");
		}else if(x>=0&&x<=8) {
			System.out.println("It is cold outside, bring a jacket!");
		}else if(x>=9&&x<=16) {
			System.out.println("The sun is coming out, and it is getting warmer");
		}else if(x>=17&&x<=32) {
			System.out.println("Time to sit beside the pool and relax");
		}else {
			System.out.println("Too hot, can't move!");
		}
	}
}
