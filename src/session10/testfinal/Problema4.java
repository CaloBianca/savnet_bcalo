package session10.testfinal;

public class Problema4 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 9, 3, 4 };
		int pos = 3;
		int n = 10;
		insert(arr, pos, n);
	}

	public static int[] insert(int[] arr, int pos, int n) {
		int i;
		int[] newarr = new int[arr.length + 1];
		for (i = 0; i < arr.length; i++) {
			if (i < pos) {
				newarr[i] = arr[i];
			} else if (i > pos) {
				newarr[i] = arr[i - 1];
			} else if (i == pos) {
				newarr[pos] = n;
			}

			System.out.println(newarr[i] + " ");
		}
		return newarr;
	}
}