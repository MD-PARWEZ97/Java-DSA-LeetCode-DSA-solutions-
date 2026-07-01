package string;

import java.util.*;
public class EachWordReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		String s1=eachWordRev(s);
		System.out.println(s1);
		sc.close();
		
	}
	public static String eachWordRev(String s) {
	    String temp = "";
	    String rev = "";

	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);

	        if (c != ' ')
	            temp = c + temp;

	        if (c == ' ' || i == s.length() - 1) {
	            rev = rev + " " + temp;
	            temp = "";
	        }
	    }
	    return rev.trim();
	}

}
