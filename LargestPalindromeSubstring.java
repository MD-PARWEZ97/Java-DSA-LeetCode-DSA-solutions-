package string;

import java.util.*;
public class LargestPalindromeSubstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String s: ");
		String s=sc.nextLine();
		String result =getLargestPalindromicSubstring(s);
		System.out.println("String is : "+result);
	}
	public static String getLargestPalindromicSubstring(String s) {
		int maxLength=0; 
		int start=0;
		int end=0;
		for(int i=0; i< s.length(); i++) {
			int oddsize =aroundCenter(s,i,i);
			int evensize =aroundCenter(s,i,i+1);
			
			int max = oddsize > evensize ? oddsize : evensize;
			
			if(max > maxLength) {
				maxLength = max;
				
				start=i-(max-1)/2;
				end=i+max/2;
			}
		}
		return s.substring(start, end+1);
	}
	public static int aroundCenter(String s, int start, int end) {
		while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
		}
		return end-start-1;
	}
}
