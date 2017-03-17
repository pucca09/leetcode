package two_point;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenqingqing on 2017/3/12.
 */
public class kdiffPairsInArray_532 {
    //双指针是o(n2)复杂度
    public int findPairs(int[] nums, int k) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(i >0 && nums[i] != nums[i-1] || i==0){
                int j = i+1;
                while(j<nums.length){
                    int diff = nums[j] - nums[i];
                    if(diff == k){
                        count ++;
                        break;
                    }
                    j++;
                }

            }

        }
        return count;

    }
    //实际上还是2sum的思想。因此可以借助hashmap
    public int findPairs2(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)   return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }

        return count;
    }
}
