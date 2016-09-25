package com._292;

public class NimGame {
	public static void main(String args[]) {
		int num =  9;
		boolean res = canWinNim(num);
		System.out.println(res);
	}

	public static boolean canWinNim(int n) {
		return n % 4 == 0 ? false : true;
	}
}
