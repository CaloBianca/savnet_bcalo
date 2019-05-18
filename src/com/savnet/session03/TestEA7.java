package com.savnet.session03;

import java.util.Arrays;

public class TestEA7 {

	public static void main(String[] args) {
		int n = 3;
		int[] sir = { 6, 8, 2, 1, 4, 9 };
		System.out.println(nthSmallest(sir, n));
	}

	public static int nthSmallest(int[] sir, int n) {
		int i;
		Arrays.sort(sir);
		if (n > sir.length) {
			return -1;
		}
		for (i = 0; i < sir.length; i++) {
			if (i == n - 1) {
				return sir[i];
			}
		}
		return sir[i];
	}
}
