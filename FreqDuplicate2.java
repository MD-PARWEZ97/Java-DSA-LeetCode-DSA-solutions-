package ArrayProgramming;

public class FreqDuplicate2 {
	public static void main(String[] args) {
		int [] a = {10,202,30,30,40,40,10,10,10,10,40,50,60,70};
		System.out.print("Oringal Arrays: ");
		for(int x:a)
			System.out.print(" "+x);
		duplicateFrequency(a);
	}
	public static void duplicateFrequency(int [] a) {
		int max = a[0];
		int min = a[0];
		for(int x:a) {
			if(x > max)
				max=x;
			else if (x < min)
				min =x;
		}
		int [] freq = new int [max-min+1];
		for(int x:a)
			freq[x-min]++;
		for(int i=0; i<freq.length;i++) {
			if(freq[i]>1)
				System.out.println((i+min)+" is Duplicate : "+freq[i]+ " times");
		}
	}
}
