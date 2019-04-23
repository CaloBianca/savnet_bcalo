package com.savnet.session03;

public class Tema10 {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 8, 5, 9, 10, 11 };
		System.out.println(marginscAverage(array));
	}

	public static int marginscAverage(int[] arr) {

		if (arr.length != 0) {
			for (int i = 0; i < arr.length; i++) {
				if (i == arr.length - 1) {
					int average = arr[0] + arr[arr.length - 1];

					return (average / 2);
				}
			}
		}
		return -1;
	}

}
