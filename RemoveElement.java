package ArrayProgramming;

import java.util.*;
public class RemoveElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] a = {10,20,30,40,50,60,70};
		for(int x : a)
			System.out.print(" "+x);

		System.out.print("\nEnter the index to remove: ");
		int index = sc.nextInt();

		int[] result = removeIndexPosition(a, index);

		System.out.print("After removal: ");
		for (int x : result)
			System.out.print(x + " ");
		
	}
	public static int[] removeIndexPosition(int []a, int index) {
		
		if (index < 0 || index >= a.length) {
			System.out.println("Invalid index");
			return a;
		}
		
		int [] b = new int [a.length-1];
			for (int i = 0, j = 0; i < a.length; i++) {
			    if (i == index) 
			    	continue;
			    b[j++] = a[i];
		}
		return b;
	}
}

