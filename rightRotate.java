package ArrayProgramming;
// one time rotation
public class rightRotate {
	public static void main(String [] args) {
		int [] a = {10,20,30,40,50,60,70};
		for(int n:a)
			System.out.print(n+" ");
		System.out.println();
		rotate(a);
		for(int n:a)
			System.out.print(n+" ");
		
	}
	public static void rotate(int [] a) {
		int temp = a[a.length-1];
		for(int i = a.length-2; i>=0; i--) {
			a[i+1] = a[i];
		}
		a[0] = temp;
	}
}
