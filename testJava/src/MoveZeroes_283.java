/**
 * Created by chenqingqing on 2017/3/1.
 */
//将所有的0放到数组尾部，且不改变不为0的数字的相对顺序，和27对比
public class MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        int m = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                int tmp = nums[i];
                nums[i] = nums[m];
                nums[m] = tmp;
                m++;

            }
        }
    }
}
