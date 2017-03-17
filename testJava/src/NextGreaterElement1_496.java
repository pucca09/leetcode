import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by chenqingqing on 2017/3/11.
 */
public class NextGreaterElement1_496 {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
    //暴力解法,o(n2)
    public int[] nextGreaterElement2(int[] findNums, int[] nums) {
        if(findNums.length == 0){
            return findNums;
        }
        for(int i = 0;i< findNums.length;i++){
            boolean flag = false;
            int j = 0;
            while(j<nums.length){
                if(flag == true && nums[j] > findNums[i]){
                    findNums[i] = nums[j];
                    break;
                }
                if(nums[j] == findNums[i]){
                    flag = true;
                }
                j++;

            }
            if(j == nums.length){
                findNums[i] = -1;
            }



        }
        return findNums;

    }
}
