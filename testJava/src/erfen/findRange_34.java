package erfen;

/**
 * Created by chenqingqing on 2017/4/15.
 */
public class findRange_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = findFirst02(nums,target);
        res[1] = findLast(nums,0,nums.length-1,target);
        return res;



    }
    private int findLast(int[] nums,int start,int end,int k){
        if(start > end){
            return -1;
        }
        int low = start;
        int high = end;
        int mid = (low+high)/2;
        if(low <= high){
            if(nums[mid] == k){
                if(mid <high && nums[mid] == nums[mid+1]){
                    return findLast(nums,mid+1,high,k);
                }else{
                    return mid;
                }
            }else if(nums[mid] < k){
                return findLast(nums,mid+1,high,k);
            }else{
                return findLast(nums,low,mid-1,k);
            }
        }
        return -1;

    }
    private int findFirst(int[] nums,int start,int end,int k)
    {
        if(start > end){
            return -1;
        }
        int low = start;
        int high = end;
        int mid = (low+high)/2;
        if(low <= high){
            if(nums[mid] == k){
                if(mid >0 && nums[mid] == nums[mid-1]){
                    return findFirst(nums,low,mid-1,k);
                }else{
                    return mid;
                }
            }else if(nums[mid] < k){
                return findFirst(nums,mid+1,high,k);
            }else{
                return findFirst(nums,low,mid-1,k);
            }
        }
        return -1;
    }
    private int findFirst02(int[] nums,int k)
    {
        int low = 0;
        int high = nums.length -1 ;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == k){
                if(mid >0 && nums[mid] == nums[mid-1]){
                    high = mid-1;
                }else{
                    return mid;
                }
            }else if(nums[mid] < k){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {5, 7, 7, 8, 8, 10};
        findRange_34 test = new findRange_34();
        int[] result = test.searchRange(arr,8);
        for(int i :result){
            System.out.println(i);
        }
    }
}
