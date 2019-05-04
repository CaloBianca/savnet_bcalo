package com.savnet.session03;

public class StringTema {
	public static void main(String[] args) {
		constructieString();
	}

	public static void constructieString() {
		int i;
		String s = "";
		for (i = 0; i <= 1000; i++) {
			s += i + ", ";
		}
		s = s.substring(0, s.length() - 2);
		System.out.print(s);

	}

}
