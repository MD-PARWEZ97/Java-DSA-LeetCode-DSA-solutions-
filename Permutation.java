package string;

import java.util.*;

public class Permutation {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		permutation(s);
		sc.close();
	}
	public static void permutation(String s) {
		printPermutation("",s);
		System.out.print("Toatal Number Of Count is :"+count);
	}
	
	public static void printPermutation(String prefix,String remaining) {
		if(remaining.length()==0) {
			System.out.println(prefix);
			count++;
			return;
		}
		for(int i=0; i<remaining.length();i++) {
			char c=remaining.charAt(i);
			String left = remaining.substring(0,i) + remaining.substring(i+1);
			printPermutation(prefix+c, left);
		}
	}
}

