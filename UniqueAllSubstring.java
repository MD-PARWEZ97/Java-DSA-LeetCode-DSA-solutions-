package string;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueAllSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String is:");
		String s=sc.nextLine();
		  allUniqueSubstrig(s);  

	}

	public static void allUniqueSubstrig(String s) {
		HashSet<String> Set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String s1 = s.substring(i, j + 1);

				Set.add(s1);
			}
		}
		
		for(String str: Set) {
			System.out.println(str);
		}
	}
}
