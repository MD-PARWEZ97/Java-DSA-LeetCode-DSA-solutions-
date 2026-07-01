package ArrayProgramming;

public class KthTimeRotation {
	public static void main(String [] args) {
		int [] a = {10,20,30,40,50,60,70};
		for(int n:a )
			System.out.print(n+" ");
		System.out.println();
		kth_rotation(a,1);
		for(int n:a)
			System.out.print(n+" ");
		
	}
	public static void reverse(int []a, int start, int end) {
		while(start<end) {
			int temp =a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
	public static void kth_rotation(int []a, int k) {
		k = k%a.length;
		reverse(a, 0,a.length-1);
		reverse(a,0,k-1);
		reverse(a,k,a.length-1);
		
	}
}
