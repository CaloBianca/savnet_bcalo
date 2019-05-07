package com.savnet.session03;

public class TestEA4 {

	public static void main(String[] args) {

		int a = 2;
		int b = 5;

		cmmmc(a, b);
	}

	public static int cmmmc(int a, int b) {

		int i;
		for (i = 2; i <= 100; i++) {
			if (i % a == 0 && i % b == 0) {
				System.out.println(i);
				return i;
			}
		}
		return i;

	}
}
