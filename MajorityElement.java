package ArrayProgramming;

import java.util.NoSuchElementException;

public class MajorityElement {
	public static void main(String[] args) {
		int[] a = {2,3,4,5,6,2,2,2,2,2,22,2,2,2,2};

		System.out.print("Original Array: ");
		for(int x : a)
			System.out.print(" " + x);

		try {
			int result = majorityElement(a);
			System.out.println("\nMajority Element: " + result);
		} catch (NoSuchElementException e) {
			System.out.println("\n" + e.getMessage());
		}
	}

	public static int majorityElement(int[] a) {
		int max = a[0];
		int min = a[0];

		// find max & min
		for(int x : a) {
			if(x > max) max = x;
			if(x < min) min = x;
		}

		int[] freq = new int[max - min + 1];

		// count frequency
		for(int x : a)
			freq[x - min]++;

		// check majority (> n/2)
		for(int i = 0; i < freq.length; i++) {
			if(freq[i] > a.length / 2) {
				return i + min;
			}
		}

		// if not found
		throw new NoSuchElementException("No Majority Element found");
	}
}