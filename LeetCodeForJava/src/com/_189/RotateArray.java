package com._189;

public class RotateArray {
	public static void main(String args[]) {
		int nums[] = {1,2,3,4,5,6,7};
		int target = 3;
		rotate_better(nums, target);
        for (int i = 0; i < nums.length; i++) {
        	System.out.print(nums[i] + ",");
        }
	}

    public static void rotate(int[] nums, int k) {
    	int len = nums.length;
        int array[] = new int[len];
        for(int i=0; i<len ;i++){
        	int index = (i+k)%len;
        	array[index] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
        	nums[i] = array[i];
        }
    }

    public static void rotate_better(int[] nums, int k) {
    	int len = nums.length;
    	rotate(nums,0,len-1);
    	rotate(nums,0,k-1);
    	rotate(nums,k,len-1);
    }

	private static void rotate(int[] nums, int start, int end) {
		int temp;
		while(start<end){
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end-- ;
		}
	}
}
