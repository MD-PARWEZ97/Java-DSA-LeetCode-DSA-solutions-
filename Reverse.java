package string;

import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s=sc.nextLine();
		String s1=reverse(s);
		System.out.println(s1);
		
		
	}
	public static String reverse(String s) {
		String rev="";
		for(int i=0; i<s.length();i++) {
			char c=s.charAt(i);
			rev = c+rev;
			
			// rev = charAt(i)+rev;
		}
		return rev;
		
	}
}
