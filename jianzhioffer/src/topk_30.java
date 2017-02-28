import java.util.ArrayList;

/**
 * Created by chenqingqing on 2017/2/24.
 */
public class topk_30 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        partition(input,0,input.length-1,k);
        int index = partition(input ,0,input.length-1,k);
        while(index != k-1){
            if(index > k-1){
                index = partition(input,0,index-1, k);
            }else{
                index = partition(input,index+1,input.length-1, k);
            }

        }
        for(int i=0;i<k;i++){
            result.add(input[i]);
        }
        return result;



    }
    private int partition(int[] a ,int low,int high,int k){
        int i = low;
        int j = high;
        int key = a[low];
        while(i<j){
            while(i<j && a[j] >= key) j--;
            a[i] = a[j];
            while(i<j && a[i] <= key) i++;
            a[j] = a[i];
        }
        a[i] = key;
        return i;
    }
    public ArrayList<Integer> GetLeastNumbers_Solution_maopao(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(k>input.length){
            return list;
        }
        for(int i = 0;i<k;i++){
            int v = i;
            for(int j = i+1;j<input.length;j++){
                if(input[j] < input[v]){
                    v = j;
                }
            }
            int temp = input[i];
            input[i] = input[v];
            input[v] = temp;
            list.add(input[i]);
        }
        return list;

    }
    public static void main(String[] args){
        topk_30 test = new topk_30();
        ArrayList<Integer> l = test.GetLeastNumbers_Solution(new int[]{2,3,4,1,5,6,8},3);
        for(int i: l){
            System.out.print(i);
        }

    }
}
