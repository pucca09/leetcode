package bimianshi;

import java.util.Stack;

/**
 * Created by chenqingqing on 2017/4/15.
 */
public class feidiguiqiucksort {
    public void quickSort(int[] arr){
        int min;
        int max;
        Stack<Integer> s = new Stack<Integer>();
        s.push(0);
        s.push(arr.length-1);
        while(! s.empty()){
            max = s.pop();
            min = s.pop();
            int j = partition(arr,min,max);
            if(min<j-1){
                s.push(min);
                s.push(j-1);
            }

            // Store the right side minus index and the max index
            if(max>j+1){
                s.push(j+1);
                s.push(max);
            }

        }
    }
    public int partition(int[] arr,int start,int end){
        int i = start;
        int j = end;
        int v = arr[start];
        while( i < j){
            while( i<j && arr[j] >= v) j--;
            arr[i] = arr[j];
            while( i<j && arr[i] <= v) i++;
            arr[j] = arr[i];
        }
        arr[i] = v;
        return i;

    }
    public static void main(String[] args){
        int[] arr = {43,56,12,78,23,100};
        feidiguiqiucksort test = new feidiguiqiucksort();
        test.quickSort(arr);
        for(int i:arr){
            System.out.println(i);
        }

    }

}
