package com._371;

public class SumofTwoIntegers {
	public static void main(String args[]){
		int a=-1,b=1;
		int res = getSum(a,b);
		System.out.println(res);
	}

    public static int getSum(int a, int b) {
        int flag=0;
        int res = 0,tmp;
    	for(int i=0;i<32;i++){
    		int c=(a>>i)&1;
    		int d=(b>>i)&1;
    		
    		tmp=c^d^flag;
    		flag = (c&d)^(d&flag)^(c&flag);
    		res=res|tmp<<i;
    	}
    	return res;
    }
}
