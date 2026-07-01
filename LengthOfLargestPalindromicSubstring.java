package string;

import java.util.*;
public class LengthOfLargestPalindromicSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String s:");
		String s=sc.nextLine();
		int result =getLargestPalindromic(s);
		System.out.println("LargestPalindromicSubstring is :" + result);
		sc.close();
		
	}
	public static int getLargestPalindromic(String s) {
		int maxLength=0;
		for(int i=0; i<s.length(); i++) {
			int odd = expendAroundCenter(s,i,i);
			int even= expendAroundCenter(s,i,i+1);
			
			int max=odd>even ? odd : even;
			
			if(max > maxLength) {
				maxLength=max;
			}
		}
		return maxLength;
	}
	
	public static int expendAroundCenter(String s, int start, int end) {
		while(start >=0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
		}
		return end-start-1;
	}
}
