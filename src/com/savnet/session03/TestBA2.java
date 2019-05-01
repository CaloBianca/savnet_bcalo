package com.savnet.session03;

public class TestBA2 {
	public static void main(String[] args) {

		int[] sir = { -3, 4, -5, 6, 7 };
		countNegatives(sir);
	}

	public static int countNegatives(int[] sir) {
		int i;
		int contor = 0;
		for (i = 0; i < sir.length; i++) {
			if (sir[i] < 0) {
				contor++;

			}

		}
		System.out.println(contor);
		return contor;

	}

}
