package string;

import java.util.*;
public class ArrangeUperToLower {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String s :");
		String s=sc.nextLine();
		String str=printArrange(s);
		System.out.println(str);
		sc.close();
		
	}
	public static String printArrange(String s) {
	    String lowercase = "";
	    String uppercase = "";

	    for(int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);

	        if(c >= 'A' && c <= 'Z')
	            uppercase = uppercase + c;
	        else
	            lowercase = lowercase + c;
	    }

	    return uppercase + lowercase;   
	}
}
