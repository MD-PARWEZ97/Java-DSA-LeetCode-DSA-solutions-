package ArrayProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class InsertElement_Another {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = {10,20,30,40,50,60,70,80};
		System.out.print("Origanl Array Before without Modifying :");
		for(int x: a)
			System.out.print(" "+x);
		
		System.out.print("\nEnter the Indext you want to add the Element :");
		int index = sc.nextInt();
		
		System.out.print("\nEnter the Value :");
		int value = sc.nextInt();
		
		int [] result=insertElement(a,index,value);
		System.out.print("\nOrignal Array After Inserting Elemnt :");
		System.out.print(" "+Arrays.toString(result));
	}
	public static int[] insertElement(int [] a,int index, int value) {
		int[] b = new int [a.length+1];
		b[index] = value;
		for(int i=0; i<b.length;i++) {
			if(i < index) {
				b[i] = a[i];
			} else if(i > index) {
				b[i] = a[i-1];
			}
		}
		return b;
	}
}
