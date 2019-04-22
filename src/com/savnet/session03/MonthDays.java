package com.savnet.session03;

public class MonthDays {
	public static void main(String[] args) {
		for (int i = 1; i <= 12; i++) {
			System.out.println(i + " : " + getDaysForMonth(i));
		}
	}

	private static int getDaysForMonth(int month) {

		switch (month) {

		case 2:
			return 28;
		case 4:
			return 30;
		case 6:
			return 30;
		case 9:
			return 30;

		}
		return 31;
	}
}
