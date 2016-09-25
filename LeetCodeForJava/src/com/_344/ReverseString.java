package com._344;

public class ReverseString {
	public static void main(String args[]){
		String str = "hello";
		String res = reverseString(str);
		System.out.println(res);
	}

	private static String reverseString(String str) {
		char[] array = str.toCharArray();
		int len = array.length;
		int i=0,j=len-1;
		while(i<j){
			char temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(array);
	}
}
