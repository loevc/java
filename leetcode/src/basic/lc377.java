package basic;

//给你一个由 不同 整数组成的数组 nums ，和一个目标整数 target 。请你从 nums 中找出并返回总和为 target 的元素组合的个数。
//
//题目数据保证答案符合 32 位整数范围。
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/combination-sum-iv
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

public class lc377 {
}

class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (num <= i) {
                    dp[i] += dp[i - num];
                }
            }
        }
        return dp[target];
    }
}

