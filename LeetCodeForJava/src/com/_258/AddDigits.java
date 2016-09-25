package com._258;

public class AddDigits {
	public static void main(String args[]){
		int num = 10;
		int res = addDigits(num);
		System.out.println(res);
	}
	
    public static int addDigits(int num) {
        while(num>=10){
        	int sum = 0;
        	int data=num,temp;
        	while(data>0){
        		temp = data%10;
        		data = data/10;
        		sum+=temp;
        	}
        	num = sum;
        }
        return num;
    }
}
