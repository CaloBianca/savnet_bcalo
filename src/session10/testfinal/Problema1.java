package session10.testfinal;

public class Problema1 {
	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		System.out.println(harmonicAvg(a, b));
	}

	public static double harmonicAvg(int a, int b) {
		double sum = a + b;
		double product = a * b;
		if (sum != 0) {
			return (2 * product) / (sum);
		}
		return 0;
	}
}
