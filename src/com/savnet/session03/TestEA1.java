package com.savnet.session03;

public class TestEA1 {
	public static void main(String[] args) {
		int n = 1327;
		reverse(n);
	}

	public static int reverse(int n) {
		int newnumber = 0;
		if (n != 0) {
			while (n != 0) {
				newnumber += n % 10;
				n = n / 10;
				if (n != 0) {
					newnumber *= 10;
				}
			}
			System.out.println(newnumber);
			return newnumber;
		}
		return 0;
	}
}