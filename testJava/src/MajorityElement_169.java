import java.util.HashMap;

/**
 * Created by chenqingqing on 2017/3/1.
 */
public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i =0;i<nums.length;i++){
            if(m.get(nums[i])!=null){
                int count = m.get(nums[i]);
                count++;
                m.put(nums[i],count);
            }else{
                m.put(nums[i],1);

            }
            if(m.get(nums[i]) > nums.length/2){
                return nums[i];

            }
        }
        return 0;
    }
}
