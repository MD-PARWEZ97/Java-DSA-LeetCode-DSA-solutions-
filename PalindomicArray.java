package ArrayProgramming;

public class PalindomicArray {
	public static void main(String[] args) {
		int [] a = {10,20,30,40,30,20,20,10};
		isPalindomic(a);
		if(isPalindomic(a)) {
			System.out.println("Array is Palindromic");
		}else {
			System.out.println("Array is not Palindromic");
		}
	}
	public static boolean isPalindomic(int []a) {
		int start =0;
		int end = a.length-1;
		while(start < end) {
			if(a[start] !=a[end]) 
				return false;
			start++;
			end--;
		}
		return true;
	}
}
