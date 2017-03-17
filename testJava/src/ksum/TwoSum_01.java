package ksum;

import java.util.HashMap;

/**
 * Created by chenqingqing on 2017/2/28.
 */
public class TwoSum_01 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            Integer index=map.get(target-nums[i]);
            if(index==null){
                map.put(nums[i],i);
            }else{
                return new int[]{i,index};
            }
        }
        return new int[]{0,0};
    }
}
