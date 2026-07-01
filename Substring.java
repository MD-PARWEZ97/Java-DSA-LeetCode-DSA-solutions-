package string;

import java.util.*;
public class Substring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Fisrt String :");
		String s1=sc.nextLine();
		System.out.println("Enter the Secound String :");
		String s2=sc.nextLine();
		boolean c = subString(s1,s2);
		System.out.println(c);
//		System.out.println(subString(s1,s2));
		sc.close();
	}
	public static boolean subString(String s1, String s2) {
		for(int i=0; i<s1.length() - s2.length(); i++) {
			int j;
		for(j=0; j<s2.length(); j++) {
			if(s1.charAt(i+j)!=s2.charAt(j))
				break;
		}
		if(j==s2.length())
			return true;
	}
	return false;
}
}