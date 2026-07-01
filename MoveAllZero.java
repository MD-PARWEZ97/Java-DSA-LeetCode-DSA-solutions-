package ArrayProgramming;

public class MoveAllZero {
	public static void main(String[] args) {
		int [] a = {1,2,0,3,0,0,4,6};
		System.out.println("Orignal Array Element");
		for(int x:a) {
			System.out.print(x + " ");
		}
		
			moveallzero(a);
			System.out.println();
			System.out.println("Move all the Zero in last : ");
			for(int x:a) {
				
				System.out.print( x+" ");
			}
		}
		
	public static void moveallzero(int []a) {
		int j=0;
		for(int i=0; i<a.length; i++) {
			
				if(a[i]!=0) {
					if(i!=j) {
						a[j] = a[i];
						a[i] = 0;
					}
					j++;
				}
			}
		}
	}

