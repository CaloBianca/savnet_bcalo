package com.savnet.session03;

public class TestBA2 {
	public static void main(String[] args) {

		int[] sir = {};
		System.out.println(arrayToNumber(sir));
	}

	public static int arrayToNumber(int[] sir) {
		int number = 0;
		int i;
		int newlength;

		if (sir != null && sir.length != 0) {
			for (i = 0; i < sir.length; i++) {
				if (sir[i] > 9 || sir[i] < 0) {
					return -2;
				}

				if (i == 0) {

					number = sir[i] * (int) Math.pow(10, sir.length - 1);
				}

				else if (i == sir.length - 1) {

					number += sir[i];
				} else {
					newlength = sir.length - 1;
					number += sir[i] * (int) Math.pow(10, newlength - i);
				}
			}
			System.out.println(number);
			return number;
		}

		return -1;
	}

}
