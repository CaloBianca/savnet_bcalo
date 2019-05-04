package com.savnet.session03;

public class TestBA8 {
	public static void main(String[] args) {
		int[] sir = { 10, 22, 8, 10, 0 };
		reverse(sir);
	}

	public static int[] reverse(int[] sir) {
		int i;
		int[] temp = new int[sir.length];
		for (i = 0; i < sir.length; i++) {
			temp[i] = sir[sir.length - 1 - i];
			System.out.print(temp[i] + " ");
		}
		return temp;
	}

}
