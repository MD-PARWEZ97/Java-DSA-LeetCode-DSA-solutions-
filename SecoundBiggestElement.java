package ArrayProgramming;

public class SecoundBiggestElement {
	public static void main(String[] args) {
		int [] a = {10,20,30,40,50,60};
		System.out.print("\nOrignal values :");
		for(int x : a)
			System.out.print(" "+x);
		
		int result = SecoundBiggestValue(a);

		if(result == Integer.MIN_VALUE) {
			System.out.println("\nNo second largest element");
		} else {
			System.out.println("\nSecond largest: " + result);
		}
	}
	public static int SecoundBiggestValue(int [] a) {
		
		int Max = Integer.MIN_VALUE;
		int secoundMax = Integer.MIN_VALUE;
		
		for (int x : a) {
			if (x > Max) {
				secoundMax = Max;
				Max = x;
			} else if (x > secoundMax && x != Max) {
				secoundMax = x;
			}
		}
		return secoundMax;
	}
}
