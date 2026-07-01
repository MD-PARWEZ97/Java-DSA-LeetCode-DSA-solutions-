package string;

import java.util.*;

public class SequanceWordReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String s=sc.nextLine();
		String s1=reverse(s);
		System.out.println(s1);
		sc.close();
	}
	public static String reverse(String s) {
		String word = "";
		String temp="";
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			temp = c+temp;
			if(c!= ' ' || i==s.length()-1 ) {
				word = temp +""+word;
				temp="";
			}
		}
		return word;
	}
}
