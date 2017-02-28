package codilityDemos;

import java.util.HashSet;
import java.util.Iterator;

public class PrefixSet {

	public static void main(String[] args) {

		int []A = {2,2,1,0,1};
		int result = solution(A);
		System.out.println(result);
	}

	private static int solution(int[] A) {

		HashSet<Integer> hashSet = new HashSet<>();
		HashSet<Integer> hashSet_sub = new HashSet<>();
		for (Integer a : A) {
			if (!hashSet.contains(a)) {
				hashSet.add(a);
			}
		}
		for (int i = 0; i < A.length; i++) {
			if (!hashSet_sub.contains(A[i])) {
				hashSet_sub.add(A[i]);
			}
			
			if(hashSet_sub.equals(hashSet)){
				return i;
			}
		}
//		printSet(hashSet);
//		printSet(hashSet_sub);
		return -1;
	}

	public static void printSet(HashSet<Integer> hashSet) {
		System.out.println("Element of main hash set");
		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}

}
