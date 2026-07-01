package string;

import java.util.*;
public class Frequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String is :");
		String s= sc.nextLine();
		printFrequency(s);
	}
	public static void printFrequency(String s) {
		if(s==null || s.length()==0)
			return;
		int [] freq = new int [26];
		s=s.toLowerCase();
		for(int i=0; i<s.length();i++) {
			char x=s.charAt(i);
			if(x >= 'a' && x <= 'z') {
				freq[x -'a']++;
			}
		}
		for(int i=0; i<26; i++) {
			if(freq[i]>0) {
				System.out.println((char)(i+'a')+"is :"+ freq[i]+" Time");
			}
		}
	}
}
