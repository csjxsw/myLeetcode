package com._1_twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String args[]){
		int nums[] = {2, 7, 11, 15};
		int target =18;
		int res[] = twoSum(nums,target);
		System.out.println(res[0]+","+res[1]);
	}

    public static int[] twoSum(int[] nums, int target) {
        int res[] = {-1,-1};
        int len = nums.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<len;i++){
        	int num = nums[i];
        	if(map.get(num)==null){
        		map.put(target-num, i);
        	}else{
        		res[0] = map.get(num);
        		res[1] = i;
        		return res;
        	}
        }
        return res;
    }
}
