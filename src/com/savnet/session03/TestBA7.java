package com.savnet.session03;

public class TestBA7 {
	public static void main(String[] args) {
		int[] sir = { 10, 22, 8, 0 };
		int n = 22;
		System.out.println(find(sir, n));
	}

	public static int find(int[] sir, int n) {
		int contor = 0;
		int i;

		if (sir.length != 0) {
			for (i = 0; i < sir.length; i++) {

				if (sir[i] != n && sir[i] >= 0) {
					contor++;
				} else if (sir[i] == n && sir[i] >= 0) {
					return contor;
				} else {
					return -1;
				}
			}
			System.out.println(contor);
		}
		return -1;

	}
}
