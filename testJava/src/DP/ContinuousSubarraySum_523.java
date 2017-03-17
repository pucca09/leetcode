package DP;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenqingqing on 2017/3/5.
 */
public class ContinuousSubarraySum_523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(){};
        map.put(0,-1);
        int runningSum = 0;
        for (int i=0;i<nums.length;i++) {
            runningSum += nums[i];
            if (k != 0) runningSum %= k;
            if (map.get(runningSum) != null) {
                if (i - map.get(runningSum) >= 2) return true;
            }
            else map.put(runningSum, i);
        }
        return false;
    }
}
