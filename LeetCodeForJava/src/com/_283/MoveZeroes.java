package com._283;

public class MoveZeroes {
	public static void main(String args[]){
		int[] nums = {0,1,0,3,12};
		moveZeroes1(nums);
		for(int i=0;i<nums.length;i++)
		System.out.println(nums[i]);
	}
	
	 public static void moveZeroes1(int[] nums) {
        int i=0,j=0,len = nums.length;
        while(i<len){
        	if(nums[i]!=0){
        		nums[j++]=nums[i++];
        	}else{
        		i++;
        	}
        }
        while(j<len){
        	nums[j++]=0;
        }
    }
	
    public static void moveZeroes(int[] nums) {
        int i=0,j = nums.length-1;
        while(i<j){
        	if(nums[i]==0){
        		int temp = nums[i];
        		nums[i]=nums[j];
        		nums[j] = temp;
        		j--;
        	}else{
        		i++;
        	}
        }
    }
}
