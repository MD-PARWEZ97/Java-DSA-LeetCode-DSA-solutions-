package ArrayProgramming;

public class HalfReverseArray {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println("Orignal Element ");
		for (int x : a)
			System.out.print(x + " ");
		System.out.println();

		int mid = a.length / 2 - 1;
		reverse(a, 0, mid);
		reverse(a, mid + 1, a.length - 1);
		System.out.println("After half Roatiting");
		for (int x : a)
			System.out.print(" " + x);

	}

	public static void reverse(int[] a, int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
}
