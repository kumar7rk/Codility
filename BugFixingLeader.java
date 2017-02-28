package codilityDemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class BugFixingLeader {

	public static void main(String[] args) {
		
		int[]A = {1,1,1,50,1};
		int result = solution(A);
		System.out.println(result);

	}

	private static int solution(int[] a) {

		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			Integer currentNumber = hashMap.get(a[i]);
			if (currentNumber == null) {
				hashMap.put(a[i], 1);
			}
			else {
				hashMap.put(a[i], ++currentNumber);
			}
		}
		Map.Entry<Integer, Integer> max = null;
		for (Map.Entry<Integer,Integer> i : hashMap.entrySet()) {
			
			if (max==null||i.getValue().compareTo(max.getValue())>0) {
				max=i;
			}
		}
		if (max.getValue()>a.length/2) {
			return max.getKey();
		}
		return -1;
	}

}
