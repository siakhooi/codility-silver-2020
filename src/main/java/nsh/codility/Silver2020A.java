package nsh.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Silver2020A implements Silver2020Interface {
	final int BIGNUMBER = 1000000001;

	public int solution(int[] A, int[] B) {
		ArrayList<Integer> S = new ArrayList<Integer>();

		for (int i = 0; i < A.length; i++)
			if (A[i] == B[i])
				S.add(A[i]);

		Collections.sort(S);
		Arrays.sort(A);
		Arrays.sort(B);

		int max = 1;

		int ai = 0, bi = 0, si = 0;
		int a = (ai < A.length) ? A[ai] : BIGNUMBER;
		int b = (bi < B.length) ? B[bi] : BIGNUMBER;
		int s = (si < S.size()) ? S.get(si) : BIGNUMBER;

		do {
			int d = Math.min(s, Math.min(a, b));

			int n = 0;
			while (a == d) {
				n++;
				ai++;
				a = (ai < A.length) ? A[ai] : BIGNUMBER;
			}
			while (b == d) {
				n++;
				bi++;
				b = (bi < B.length) ? B[bi] : BIGNUMBER;
			}
			while (s == d) {
				n--;
				si++;
				s = (si < S.size()) ? S.get(si) : BIGNUMBER;
			}
			max = Math.max(max, n);
		} while (a != BIGNUMBER || b != BIGNUMBER || s != BIGNUMBER);

		return max;
	}
}
