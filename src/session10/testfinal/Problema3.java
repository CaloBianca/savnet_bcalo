package session10.testfinal;

public class Problema3 {
	public static void main(String[] args) {
		int n = 7;
		int[] arr = { 1, 5, 7, 2, 4 };
		System.out.println(next(arr, n));
	}

	public static int next(int[] arr, int n) {
		if (n == arr[arr.length - 1]) {
			return -1;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return arr[i + 1];
			}
		}
		return -2;
	}
}
