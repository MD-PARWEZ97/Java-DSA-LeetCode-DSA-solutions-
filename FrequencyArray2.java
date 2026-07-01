package ArrayProgramming;

public class FrequencyArray2 {
	public static void main(String[] args) {
		int[] a = {10,30,30,4,10,101,101,101,101,30};

		System.out.println("\nOriginal Array:");
		for(int x : a)
			System.out.print(" "+x);
		System.out.println();

		frequencyArray(a);
	}

	public static void frequencyArray(int[] a) {
		int max = a[0];
		int min = a[0];

		// find max and min
		for(int x : a) {
			if (x > max) {
				max = x;
			} else if (x < min) {
				min = x;
			}
		}

		int[] freq = new int[max - min + 1];

		// count frequency
		for(int x : a) {
			freq[x - min]++;                                                      // index = value - min
		}

		for(int i = 0; i < freq.length; i++) {
			if(freq[i] > 0) {
				System.out.println((i + min) + " is: " + freq[i] + " times");     // value = index + min
			}
		}
	}
}
