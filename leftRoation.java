package ArrayProgramming;

public class leftRoation {
	public static void main(String [] args) {
		int [] a = {10,20,30,40,50,60,70};
		for(int n:a)
			System.out.print(n+" ");
		System.out.println();
		oneTimeRotation(a);
		for(int n:a)
			System.out.print(n+" ");
		
	}
	public static void oneTimeRotation(int [] a) {
		int temp = a[0];
		for(int i =1; i<a.length;i++) {
			a[i-1] = a[i];
		}
		a[a.length-1] = temp;
	}
}
