package recursion;

import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n=sc.nextInt();
		int result =fib(n);
		System.out.println("Fibonacci Number : "+result);
		
		for(int i=0; i<=n; i++) {
			System.out.print(fib(i)+" ");
		}
		sc.close();
	}
	
	public static int fib(int n) {
		if(n==0 || n==1)
			return n;
		return fib(n-1) + fib(n-2);
	}
}
