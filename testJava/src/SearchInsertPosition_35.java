/**
 * Created by chenqingqing on 2017/3/1.
 */
public class SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        return search(nums,0,nums.length-1,target);


    }
    private int search(int[] nums, int start,int end,int k){
        if(start > end){
            return start;
        }
        int low = start;
        int high = end;
        if(start <= end){
            int mid = (low+high)/2;
            if(nums[mid] == k){
                return mid;
            }else if(nums[mid] < k){
                return search(nums,mid+1,high,k);
            }else{
                return search(nums,low,mid-1,k);
            }
        }
        return start;
    }
}
