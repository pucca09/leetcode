package DP;

/**
 * Created by chenqingqing on 2017/3/5.
 */
public class HouseRobber_198 {
    public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int[][] money = new int[nums.length][2];
        money[0][0] = 0;
        money[0][1] = nums[0];
        for(int i = 1;i<nums.length;i++){
            money[i][0] = (money[i-1][0] >= money[i-1][1])?money[i-1][0]:money[i-1][1];
            money[i][1] = money[i-1][0]+nums[i];
        }
        return (money[nums.length-1][0] >= money[nums.length-1][1])?money[nums.length-1][0]:money[nums.length-1][1];
    }
}
