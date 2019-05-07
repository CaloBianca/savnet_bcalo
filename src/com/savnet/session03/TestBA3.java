package com.savnet.session03;
//Scrieti intr-o clasa numita TestEA3 o metoda care primeste ca parametru un numar pozitiv intreg n 

//si returneaza true daca numarul respectiv este prim si false in caz contrar.
//Un numar este prim daca se divide doar cu 1 si cu el insusi. Numerele 0, 1 nu se considera prime.

public class TestBA3 {
	public static void main(String[] args) {
		int n = 6;
		System.out.println(isPrime(n));
	}

	public static boolean isPrime(int n) {
		int i;
		int contor = 0;
		for (i = 1; i <= n; i++) {
			if (n >= 0 && n % i == 0) {
				contor++;
			}
		}
		if (contor == 2) {
			return true;
		}
		return false;
	}

}
