package ArrayProgramming;

import java.util.Scanner;

public class RemoveElm_Another {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = {10,20,30,40,50,60,70};
		for(int x : a)
			System.out.print(" "+x);

		System.out.print("\nEnter the index to remove: ");
		int index = sc.nextInt();

		int[] result = removeElementFromIndex(a, index);

		System.out.print("After removal: ");
		for (int x : result)
			System.out.print(x + " ");
		
	}
	public static int[] removeElementFromIndex(int []a, int index) {
		int [] b= new int[a.length-1];
		for(int i=0; i<b.length; i++) {
			if(i<index) {
				b[i] = a[i];
			} else
					b[i] = a[i+1];
			}
		return b;
		}
	}

