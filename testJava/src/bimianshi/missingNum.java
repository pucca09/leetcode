package bimianshi;

/**
 * Created by chenqingqing on 2017/4/15.
 */
public class missingNum {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,6,9};
        System.out.println(getRemoveNums(arr,9));
    }
    private static String getRemoveNums(int[] arr, int n){
        String result = "";
        int[] bucket = new int[n + 1];
        bucket[0]=1;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            bucket[num] = 1;
        }
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i] != 1 ) {
                result += i + ",";
            }
        }
        return result.substring(0,result.length()-1);

    }
}
