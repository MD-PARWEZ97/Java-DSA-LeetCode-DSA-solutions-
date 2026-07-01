package string;
// Print largest substring without repetition 

import java.util.*;
public class LargestUniqueSubstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		String str=largestSubstringWithoutRepetition(s);
		System.out.println("largest substring without repetition :"+str);
	}
	public static String largestSubstringWithoutRepetition(String s) {
		int [] index=new int [128];
		Arrays.fill(index, -1);
		int left=0, start=0, maxlen=0;
		for(int right=0; right<s.length(); right++ ) {
			char c=s.charAt(right);
			
			 // Step 1: Handle duplicate
            if (index[c] >= left) {
                left = index[c] + 1;
            }
            // Step 2: Update last seen index
            index[c] = right;
            // Step 3: Calculate length
            int templen = right - left + 1;

            // Step 4: Update max
            if (templen > maxlen) {
                maxlen = templen;
                start = left;
            }
        }
		return s.substring(start,start+maxlen);
	}
}
