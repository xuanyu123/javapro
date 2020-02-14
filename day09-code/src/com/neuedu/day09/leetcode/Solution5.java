package com.neuedu.day09.leetcode;

/**
 * @author xuanyu
 * @date 2020-02-14 9:24 下午
 * 小A 和 小B 在玩猜数字。
 * 小B 每次从 1, 2, 3 中随机选择一个，
 * 小A 每次也从 1, 2, 3 中选择一个猜。
 * 他们一共进行三次这个游戏，请返回 小A 猜对了几次？
 * 输入的guess数组为 小A 每次的猜测，answer数组为 小B 每次的选择。
 * guess和answer的长度都等于3。
 * 示例 1：
 *      输入：guess = [1,2,3], answer = [1,2,3]
 *      输出：3
 *      解释：小A 每次都猜对了。
 * 来源：力扣（LeetCode）
 */
public class Solution5 {
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i]==answer[i]){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int[] guess = {2,2,3};
        int[] answer = {2,2,1};
        int s = solution5.game(guess,answer);
        System.out.println(s);
    }
}
