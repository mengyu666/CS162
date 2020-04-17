package Lab_2_VPL_Exercises;

import java.util.Scanner;

/*
 * CS162-Introduction to Computer Science II Lab 2 VPL Exercises
 * Mengyu Rao
 * 2020.3.30
 * HF.China
 */
public class MethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String text = "";

		for (int i = 0; i < n; i++) {
			text += sc.next();
			text += " ";
		}
		text = text.toLowerCase();
		int x = sc.nextInt();
		int x1 = sc.nextInt();
		String s = sc.next();
		char c = s.charAt(0);
		String s1 = sc.next();
		char c1 = s1.charAt(0);
		
		// A print statement for each method
		System.out.println(manipulation(text));
		System.out.println(manipulation(text, c));
		System.out.println(manipulation(text, x));
		System.out.println(manipulation(text, x, x1));
		System.out.println(manipulation(text, c, c1));
		System.out.println(manipulation(text, c, x));
	}

	// manipulation (String) method
	public static String manipulation(String str) {
		str = str.replace(" ", "");
		return str;
	}

	// manipulation (String, char) method
	public static String manipulation(String str, char c) {
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != c) {
				s += str.charAt(i);
			}
		}
		return s;
	}

	// manipulation (String, int) method
	public static String manipulation(String str, int n) {
		char s = str.charAt(n);
		String s1 = s + "";
		str = str.replaceAll(s1, "");
		return str;

	}

	// manipulation (String, int, int) method
	public static String manipulation(String str, int beginIndex, int endIndex) {
		String s = "";
		s += str.substring(0, beginIndex + 1);
		s += str.substring(endIndex, str.length());
		return s;
	}

	//manipulation (String, char, char) method
	public static String manipulation(String str, char c, char c1) {
		int idx1 = str.indexOf(c);
		int idx2 = str.lastIndexOf(c1);
		String s = "";
		s += str.substring(0, idx1 + 1);
		s += str.substring(idx2, str.length());
		return s;
	}

	// manipulation (String, char, int) method
	public static String manipulation(String str, char c, int x) {
		int idx=0;
		int num=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				num++;
				if(num==x) {
					idx =i;
					break;
				}
			}
		}
		String s = "";
		s += str.substring(idx, str.length());
		return s;
	}
}
