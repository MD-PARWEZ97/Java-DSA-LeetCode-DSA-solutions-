package recursion;

import java.util.*;
public class Tribonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int n=sc.nextInt();
		
		int result =tribo(n);
		System.out.println("Tribonacci Number :"+result);
		
		for(int i=0; i<=n; i++) {
			System.out.print(tribo(i)+" ");
		}
	}
	public static int tribo(int n) {
		if(n==0 || n==1) 
			return n;
		else if(n==2)
			return 1;
		return tribo(n-1) + tribo(n-2)+ tribo(n-3);
	}
}
