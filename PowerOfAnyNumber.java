package recursion;

import java.util.*;
public class PowerOfAnyNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		boolean str=isPower(n);
		System.out.println(str);
	}
	public static boolean isPower(int n) {
		if(n<=0) 
			return false;
		if(n==1)
			return true;
		return n%3==0 && isPower(n/3);
	}
}
