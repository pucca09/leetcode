package JZOffer;

/**
 * Created by chenqingqing on 2017/2/23.
 */
public class minOfRotateArr_08 {
    public int minNumberInRotateArray(int [] array) {
        int low = 0;
        int high = array.length-1;
        int mid = low;
        while(array[low] >= array[high]){
            mid = (low+high)/2;
            if(array[low] == array[mid] && array[mid] == array[high]){
                min(array,low,high);
            }else{
                if((high - low) == 1){
                    mid = high;
                    break;

                }
                if(array[mid] >= array[low]){
                    low = mid;
                }else if(array[mid] <= array[high]){
                    high = mid;
                }

            }



        }
        return array[mid];

    }
    public int min(int[] array,int low,int high){
        int res = array[low];
        for(int i = low;i<=high;i++){
            if(array[i] < res){
                res = array[i];
            }
        }
        return res;

    }
}
