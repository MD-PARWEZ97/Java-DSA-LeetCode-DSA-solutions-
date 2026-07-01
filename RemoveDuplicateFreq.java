package ArrayProgramming;

public class RemoveDuplicateFreq {
	public static void main(String[] args) {
		int [] a = {8,2,6,6,7,8,8,9,5};
		for(int x: a)
			System.out.print(x+" ");
		System.out.println(" \nFreuqency Of Array");
		freqDuplicate(a);
		
	}
	public static void freqDuplicate(int []a) {
		int n = a.length-1;
		for(int i=0; i<=n; i++) {
			int count = 1;
			for(int j = i+1; j<=n; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j] = a[n];
					n--;
					j--;
				}
			}
			System.out.println(a[i]+ " is : " + count+ " times ");
		}
		for(int i=0; i<=n; i++) {
			System.out.print(a[i]+ " ");
		}
	}
}
