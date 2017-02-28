package codilityDemos;

import icsV1dot1.Time;

public class Equi {

	public static void main(String[] args) {
		Time.startTime();
		int[] A = {-1,3,-4,5,1,-6,2,1};
		int result = solution(A);
		System.out.println(result);
		Time.endTime();
	}

	private static int solution(int[] A) {
		long sum = 0;
		for (int i : A) {
			sum+=i;
		}
		long sum_left = 0;
		for (int i = 0; i < A.length; i++) {
			long sum_right = sum-sum_left - (long) A[i];	
			if (sum_left==sum_right) return i;
			sum_left += A[i];
			}
		return -1;
	}
}
