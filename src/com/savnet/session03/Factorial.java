package com.savnet.session03;

public class Factorial {

	public static void main(String[] args) {

		int[] sir = null;
		System.out.println(product(sir));

	}

	public static int product(int[] sir) {

		int contor = 0;
		int inmultire = 1;
		int i = 0;
		if (sir != null) {
			for (i = 0; i < sir.length; i++) {
				if (sir[i] != 0) {
					inmultire *= sir[i];

				} else {
					contor++;
				}
			}
			if (contor == sir.length) {
				return 1;
			}
			System.out.println(inmultire);
			return inmultire;
		}
		return 1;
	}
}
