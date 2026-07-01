package ArrayProgramming;

public class FrequencyArray {
	public static void main(String[] args) {
		int [] a= {8,12,6,8,12,9,8,8};
		for(int x : a)
			System.out.print(x+" ");
		System.out.println();
		printFrequencyArray(a);
	}
	
	public static void printFrequencyArray(int []a) {
		System.out.println("Frequency Array ");
		int n =a.length-1;
		for(int i=0; i<=n; i++) {
			int count = 1;
			for(int j=i+1; j<=n; j++) {
				if(a[i]==a[j]) {
					count++;
					a[j] = a[n];
					n--;
					j--;
				}
			}
			System.out.println(a[i]+ " is :" + count +" time ");
		}
		System.out.println("Print Unique element ");
		
		for(int i=0; i<=n; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
}
