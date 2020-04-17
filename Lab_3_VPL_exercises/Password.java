package Lab_3_VPL_exercises;

import java.util.Scanner;
/*
 * CS162-Introduction to Computer Science II Lab 3 VPL Exercises
 * Mengyu Rao
 * 2020.4.16
 * HF.China
 */
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String password = sc.next(); //input the password
		int score = checkString(password); //call the checkString method from the main method
		if(score>0&&score<4) {
			System.out.println("Password strength: Weak");
		}else if(score>=4&&score<6) {
			System.out.println("Password strength: Fair");
		}else if(score>=6&&score<8) {
			System.out.println("Password strength: Good");
		}else if(score>=8&&score<=10){
			System.out.println("Password strength: Strong");
		}
	}
	
	//checkString method
	public static int checkString(String password) {
		int score=0;
		//length>=8
		if(password.length()>=8&&password.length()<=12){
			score++;
		}
		//length >=12
		if(password.length()>=12) {
			score++;
		}
		//At least 1 lowercase letter
		if(password.matches("[A-Za-z0-9#@!?]*[a-z][A-Za-z0-9#@!?]*")) {
			score++;
		}
		//At least 2 or more lowercase letters
		if(password.matches("[A-Za-z0-9#@!?]*[a-z][A-Za-z0-9#@!?]*[a-z][A-Za-z0-9#@!?]*")) {
			score++;
		}
		//At least 1 uppercase letter
		if(password.matches("[A-Za-z0-9#@!?]*[A-Z][A-Za-z0-9#@!?]*")) {
			score++;
		}
		//At least 2 or more uppercase letters
		if(password.matches("[A-Za-z0-9#@!?]*[A-Z][A-Za-z0-9#@!?]*[A-Z][A-Za-z0-9#@!?]*")) {
			score++;
		}
		//At least 1 digit
		if(password.matches("[A-Za-z0-9#@!?]*[0-9][A-Za-z0-9#@!?]*")) {
			score++;
		}
		//At least 2 or more digits
		if(password.matches("[A-Za-z0-9#@!?]*[0-9][A-Za-z0-9#@!?]*[0-9][A-Za-z0-9#@!?]*")) {
			score++;
		}
		//At least 1 special character -> # ! ? @, you only have to consider these 4 special characters for this question.
		if(password.matches("[A-Za-z0-9#@!?]*[#!?@][A-Za-z0-9#@!?]*")) {
			score++;
		}
		//At least 2 or more special characters -> # ! ? @, you only have to consider these 4 special characters for this question.
		if(password.matches("[A-Za-z0-9#@!?]*[#!?@][A-Za-z0-9#@!?]*[#!?@][A-Za-z0-9#@!?]*")) {
			score++;
		}
		return score;
	}
}
