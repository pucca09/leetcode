package JZOffer;

/**
 * Created by chenqingqing on 2017/4/13.
 */
public class nixu_36 {
    public int InversePairs(int [] array) {
        return reverseNum(array,0,array.length-1);



    }
    private int reverseNum(int [] a ,int low,int high){
        int start = low;
        int end = high;
        int mid = (start + end)/2;
        if(start >= end){
            return 0;
        }
        int left = reverseNum(a ,start,mid);
        int right = reverseNum(a ,mid+1,end);
        int count = merge(a,start,mid,end);
        return (count+left+right)%1000000007;

    }
    private int merge(int[] a ,int start,int mid,int end){
        int i = mid;
        int j = end;
        int n = end-start+1;
        int[] b = new int[n];
        int count = 0;
        for(int k=n-1;k>=0;k--){
            if(j<mid + 1) b[k] = a[i--];
            else if(i<start) b[k] = a[j--];
            else if(a[i] > a[j]){
                count += j-mid;
                b[k] = a[i--];
                if(count > 1000000007 ){
                    count %= 1000000007 ;
                }

            }else{
                b[k] = a[j--];
            }
        }
        for(int k = 0;k<n;k++){
            a[start+k] = b[k];
        }
        return count;
    }
}
