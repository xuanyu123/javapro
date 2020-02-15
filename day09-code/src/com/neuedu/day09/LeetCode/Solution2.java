package com.neuedu.day09.LeetCode;

import java.util.Arrays;

/**
 * @author xuanyu
 * @date 2020-02-14 12:25 上午
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，
 * 并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * 示例:
 *      给定 nums = [2, 7, 11, 15], target = 9
 *      因为 nums[0] + nums[1] = 2 + 7 = 9
 *      所以返回 [0, 1]
 *来源：力扣（LeetCode）
 * 解决方案：方法一：两层循环，遍历
 */
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        Solution2 solution2 = new Solution2();
        int[] nums = {2,7,11,15,4,6};
        int target = 8;
        String s = Arrays.toString(solution2.twoSum(nums,target));
        System.out.println(s);
    }
}
