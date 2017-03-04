/**
 * Created by chenqingqing on 2017/3/1.
 */
public class RemoveDuplicatesfromSortedArr_26 {
    public int[] removeDuplicates(int[] nums) {
        if(nums.length ==0){
            return null;
        }
        int[] newArr = new int[nums.length];
        newArr[0] = nums[0];
        int k = 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                newArr[k] = nums[i];
                k++;
            }


        }
        return newArr;

    }
    //原地
    public int removeDuplicates2(int[] A) {
        if (A.length==0) return 0;
        int head=0;//头指针指示当前不重复的数字的位置
        for (int i=0; i<A.length; i++)
            if (A[i]!=A[head]){
                //头指针指示当前不重复的位置，因此要填充新数字时要往后移动一位
                head++;
                A[head]=A[i];
            }
        //头指针指示当前不重复的位置，数组长度是当前坐标+1
        return head+1;
    }
    public static void main(String[] args){
        int[] a = new int[]{1,1,2};
        RemoveDuplicatesfromSortedArr_26 test = new RemoveDuplicatesfromSortedArr_26();
        int[] b = test.removeDuplicates(a);
        for(int i:b){
            System.out.println(i);
        }



    }
}
