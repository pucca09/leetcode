import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenqingqing on 2017/3/1.
 */
public class ContainsDuplicate_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
