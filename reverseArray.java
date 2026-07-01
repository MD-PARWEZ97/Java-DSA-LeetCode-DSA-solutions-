package ArrayProgramming;

public class reverseArray {
	public static void main(String [] args) {
		int [] a = {10,20,30,40,50};
		System.out.println("===========Before reverse======== ");
		for(int n:a)
			System.out.print(n+ " ");
		System.out.println();
		reverse(a);
		System.out.println("=======After reverse =========");
		for(int n:a)
			System.out.print(n+ " ");
		
	}
	public static void reverse(int [] a) {
		int start = 0;
		int end = a.length-1;
		while(start < end ) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
}
