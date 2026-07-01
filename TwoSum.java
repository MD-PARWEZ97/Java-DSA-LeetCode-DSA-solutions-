package ArrayProgramming;

import java.util.Arrays;

public class TwoSum {
	public static void main(String [] args) {
		
		int [] a = {2,7,11,15};
		int target =18;
		
		int [] sum =twoSum(a,target);
		  System.out.println(Arrays.toString(sum));
		
	}
	public static int [] twoSum(int []a, int target) {
		for(int i =0; i<a.length-1; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]+a[j] == target)
					return new int [] {i,j};
			}
		}
		return new int[] {};
	}
	
}
