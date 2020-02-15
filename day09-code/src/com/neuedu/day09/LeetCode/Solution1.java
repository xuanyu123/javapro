package com.neuedu.day09.LeetCode;

/**
 * @author xuanyu
 * @date 2020-02-14 6:00 下午
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 示例 1:
 *       给定 nums = [3,2,2,3], val = 3,
 *       函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 *       你不需要考虑数组中超出新长度后面的元素。
 * 来源：力扣（LeetCode）
 */
public class Solution1 {
    public int removeElement(int[] num,int val){
        //k记录不等于val的个数
        int k = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != val){
                num[k]=num[i];
                k++;
            }
        }
        //新的顺序表的长度
        return k;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[] num = {3,2,2,3};
        int value = 3;
        int s = solution1.removeElement(num,value);
        System.out.println(s);
    }
}
