package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class AbstractSilver2020Test {
	abstract Silver2020Interface getTestObject();

	@Test
	void test01() {
		int[] A = new int[] { 2, 3, 2, 3, 5 };
		int[] B = new int[] { 3, 4, 2, 4, 2 };
		int a = 3;

		assertEquals(a, getTestObject().solution(A, B));
	}

	@Test
	void test02() {
		int[] A = new int[] { 2, 3, 1, 3 };
		int[] B = new int[] { 2, 3, 1, 3 };
		int a = 2;

		assertEquals(a, getTestObject().solution(A, B));
	}

	@Test
	void test03() {
		int[] A = new int[] { 2, 10, 4, 1, 4 };
		int[] B = new int[] { 4, 1, 2, 2, 5 };
		int a = 3;

		assertEquals(a, getTestObject().solution(A, B));
	}

	@Test
	@DisplayName("No rotations needed. Common side can be chosen from B. N = 15.")
	void test04() {
		int[] A = new int[] { 2, 10, 4, 1, 4, 3, 7, 6, 2, 8, 4, 5, 8, 1, 2 };
		int[] B = new int[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
		int a = 15;

		assertEquals(a, getTestObject().solution(A, B));
	}

	@Test
	@DisplayName("anty_common_side")
	void test05() {
		int[] A = new int[] { 2, 2, 2, 3, 3 };
		int[] B = new int[] { 3, 3, 4, 4, 4 };
		int a = 4;

		assertEquals(a, getTestObject().solution(A, B));
	}

	@Test
	@DisplayName("all square")
	void test06() {
		int[] A = new int[] { 2, 2, 2, 2, 3, 3, 4, 4 };
		int[] B = new int[] { 2, 2, 2, 2, 3, 3, 4, 4 };
		int a = 4;

		assertEquals(a, getTestObject().solution(A, B));
	}

	@Test
	@DisplayName("no same side")
	void test07() {
		int[] A = new int[] { 1, 3, 5, 7 };
		int[] B = new int[] { 2, 4, 6, 8 };
		int a = 1;

		assertEquals(a, getTestObject().solution(A, B));
	}
}
