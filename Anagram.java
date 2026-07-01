package string;

import java.util.*;
public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Spring s :");
		String s=sc.nextLine();
		System.out.println("Enter secound String t :");
		String t=sc.nextLine();
		boolean str =isAnagram(s,t);
		System.out.println(str);
		sc.close();
		
	}
	public static boolean isAnagram(String s,String t) {
		if(s.length()!=t.length())
			return false;
		int [] freq1=printFrequency(s);
		int [] freq2=printFrequency(t);
		
		for(int i=0; i<128;i++) {
		if(freq1[i]!=freq2[i])
		return false;
		}
		return true;
	}
	public static int[] printFrequency(String s) {
		s=s.toLowerCase();
		int [] freq=new int [128];
		for(int i=0; i<s.length();i++) {
			freq[s.charAt(i)]++;
		}
		return freq;
	}
}
