package com.neuedu.day09.leetcode;

/**
 * @author xuanyu
 * @date 2020-02-14 6:36 下午
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 示例 1:
 *       给定数组 nums = [1,1,2],
 *       函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *       你不需要考虑数组中超出新长度后面的元素。
 * 来源：力扣（LeetCode）
 */
public class Solution3 {
    public int removeDuplicates(int[] nums) {
        if(nums == null){
            return 0;
        }
        if(nums.length <=1){
            return nums.length;
        }
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[count-1]){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[] num = {0,0,1,1,1,2,2,3,3,4};
        int s = solution3.removeDuplicates(num);
        System.out.println(s);
    }
}
