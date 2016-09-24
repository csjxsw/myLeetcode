package com._136;

public class SingleNumber {
	public static void main(String args[]) {
		int nums[] = {5,6,7,4,5,6,7};
		int target = 3;
		int num = singleNumber(nums);
    	System.out.print(num);
	}

    public static int singleNumber(int[] nums) {
        int len = nums.length;
        int res = nums[0];
        if(len ==1) return res;
        for(int i =1 ;i<len;i++){
        	res^=nums[i];
        }
        return res;
    }
}
