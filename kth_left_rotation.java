package ArrayProgramming;

public class kth_left_rotation {
	public static void main(String []args) {
		int [] a = {10,20,30,40,50,60,70};
		for(int n:a)
			System.out.print(n+" ");
		System.out.println();
		kthRoation(a,3);
		for(int n:a)
			System.out.print(n+" ");
		
		
	}
	public static void reverse(int []a,int start, int end) {
		while(start<end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
	}
	public static void kthRoation(int [] a, int k) {
		k = k%a.length;
		reverse(a,0,a.length-1);
		reverse(a,0,a.length-k-1);
		reverse(a,a.length-k, a.length-1);
	}
}
