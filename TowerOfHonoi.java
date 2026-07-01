package recursion;

import java.util.*;
public class TowerOfHonoi {
	static int count = 0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		toh(n,'A','B','C');
		
		System.out.println("Total Number of count : "+count);
		sc.close();
	}
	public static void toh(int n, char from, char aux, char to) {
		count++;
		if(n==1) {
			System.out.println("move the disk "+from+" to "+ to);
			return ;
		}
		
		toh(n-1,from,to,aux);
		System.out.println("move the disk " + from + " to " +to);
			
		toh(n-1,aux,from,to);
	}
}
