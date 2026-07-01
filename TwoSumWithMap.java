package ArrayProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumWithMap {
	public static void main(String[] args) {
		int [] a = {10,20,4,50,2,4};
		int target=24;
		int [] sum=twoSum(a,target);
		System.out.println(Arrays.toString(sum));
	}
	public static int [] twoSum(int [] a , int target) {
		    Map<Integer, Integer> map = new HashMap<>();

		    for (int i = 0; i < a.length; i++) {
		        int diff = target - a[i];

		        if (map.containsKey(diff)) {
		            return new int[]{map.get(diff), i};
		        }

		        map.put(a[i], i);
		    }

		    return new int[]{};
		}
}
