/**
 * Created by chenqingqing on 2017/3/2.
 */
//有重复
public class SearchinRotatedSortedArray_81 {
    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return -1;
        }
        int left = 0;
        int right = nums.length -1;
        while(left <= right)
        {
            int mid = (left + right) / 2;

            if(nums[mid] == target)
            {
                return mid;
            }

            if(nums[mid] > nums[left])//在左边
            {
                if(nums[mid] > target && nums[left] <= target)
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }
            else if(nums[mid] < nums[left])//在右边
            {
                if(nums[mid] < target && nums[right] >= target)
                {
                    left = mid + 1;
                }
                else
                {
                    right = mid - 1;
                }
            }else{
                left ++;
            }
        }
        return -1;

    }
}
