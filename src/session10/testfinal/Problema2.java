package session10.testfinal;

public class Problema2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(isSorted(arr));
	}

	public static boolean isSorted(int[] arr) {
		int contor = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[arr.length - 1] >= arr[arr.length - 1 - i]) {
				contor++;
			}
		}
		if (contor == arr.length) {
			return true;
		}
		return false;
	}
}
