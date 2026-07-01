package string;

import java.util.*;
public class PlandromicOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String s");
		String s=sc.nextLine();
		boolean result =checkPlandromic(s);
		System.out.println(result);
	}
	
	public static boolean checkPlandromic(String s) {
		s.toUpperCase();
		int start=0;
		int end=s.length()-1;
		while(start <=end) {
			if(s.charAt(start)!= s.charAt(end))
			return false;
			start++;
			end--;
		}
		return true;
	}
}
