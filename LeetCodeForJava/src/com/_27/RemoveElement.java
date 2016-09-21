package com._27;

public class RemoveElement {
	public static void main(String args[]) {
		int nums[] = { 2, 2, 4, 3, 5, 4, 6 };
		int target = 4;
		int res = removeElement(nums, target);
		System.out.println(res);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
	}

	public static int removeElement(int[] nums, int val) {//mytest
		int len = nums.length;
		int i = 0, j = len - 1;
		int temp;
		while (i <= j) {
			while (nums[i] != val) {
				i++;
			}
			while (nums[j] == val) {
				j--;
			}
			if (i <= j) {
				temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				i++;
				j--;
			}
		}
		for (j = len - 1; j >= 0; j--) {
			if (nums[j] != val)
				break;
		}
		return j + 1;
	}

	public static int removeElement_better(int[] A, int elem) {
		if (A.length == 0)
			return A.length;
		int i = 0, j = A.length - 1;
		while (i <= j) {
			if (A[i] == elem) {
				int tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
				--j;
			} else {
				++i;
			}
		}
		return j + 1;
	}
}
