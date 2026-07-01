package ArrayProgramming;

public class NotallReverse {
	public static void main(String []args) {
		int [] a = {10,20,30,40,50,60,70,80};
		for(int n:a)
			System.out.print(n+" ");
		System.out.println();
		reverse(a,0,3);
		for(int n:a)
			System.out.print(n+ " ");
		
	}
	public static void reverse(int [] a,int start, int end) {
		while(start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] =temp;
			start++;
			end--;
		}
	}
}
