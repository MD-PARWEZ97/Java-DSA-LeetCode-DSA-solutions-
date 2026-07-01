package ArrayProgramming;

import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		
		 if (isPrime(n))
	            System.out.println(n + ": is Prime");
	        else
	            System.out.println(n + ": is Not Prime");
	}
	public static boolean isPrime(int n) {
		if(n < 2)
			return false;
		else if(n==2 || n==3)
			return true;
		else if(n%2 ==0)
			return false;
		
		for(int i= 3; i*i<= n; i+=2) {
			if(n%i ==0)
				return false;
		}
		return true;
	}
}
