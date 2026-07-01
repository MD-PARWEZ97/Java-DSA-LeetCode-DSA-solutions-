package ArrayProgramming;



public class MaxConsucativeOne {
	public static void main(String[] args) {
		int [] a = {2,3,1,0,1,1,3,4,1,0,0,1,1,1,1};
		for(int x : a) {
			System.out.print(x +" " );
		}
		System.out.println();
		int max = maxConsucatioveOnes(a);
		System.out.println("Max ConsucativeOne is : "+max);
			
	}
	public static int maxConsucatioveOnes(int []a) {
		int tempcount=0;
		int finalcount=0;
		for(int x: a) {
			if(x==1) {
				tempcount++;
			} else {
				if(tempcount > finalcount)
					finalcount=tempcount;
				tempcount=0;
			}
			if(tempcount > finalcount) {
				finalcount = tempcount;
			}
		}
		return finalcount;
	}
}
