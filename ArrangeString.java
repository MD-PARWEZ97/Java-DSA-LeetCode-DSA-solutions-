package string;

import java.util.Scanner;

public class ArrangeString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String s :");
		String s=sc.nextLine();
		String str=stringArrange(s);
		System.out.println(str);
		sc.close();
		
	}
	public static String stringArrange(String s) {
		String result = "";
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			if(c>='A' && c<='Z') 
				result = c+result;
				else 
					result=result+c;
		}
		return result;
	}
}
