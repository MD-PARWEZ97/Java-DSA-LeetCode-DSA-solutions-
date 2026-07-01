package string;

import java.util.*;
public class LargestLengthUniqueSubstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String is : ");
		String s =sc.nextLine();
		int result = getLargestUniqueSubstring(s);
		System.out.print("Largest lenght of Substring without repatation :" + result);
		sc.close();
	}
	public static int getLargestUniqueSubstring(String s) {
		int [] index = new int [128];
		Arrays.fill(index, -1);
		
		int left=0, maxlen=0;
		for(int right=0; right<s.length(); right++) {
			char c=s.charAt(right);
		if(index[c] >= left) {
			left = index[c]+1;
		}
		index[c] = right;
		int templength = right-left+1;
		if(templength > maxlen)
			maxlen = templength;
		}
		return maxlen;
		
	}
	
}
