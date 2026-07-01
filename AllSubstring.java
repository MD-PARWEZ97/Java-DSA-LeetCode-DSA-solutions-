package string;

import java.util.Scanner;

public class AllSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String is : ");
		String s = sc.nextLine();
		allSubstring(s);
		
	}
	public static void allSubstring(String s) {
		for(int i=0; i<s.length(); i++) {
			for(int j=i; j<s.length();j++) {
				String c = s.substring(i, j+1);
				System.out.println(c);
			}
		}
	} 
	
}
