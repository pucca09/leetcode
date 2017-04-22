package Sort;

import java.util.Scanner;

/**
 * Created by chenqingqing on 2017/4/9.
 */
public class sort {
    public static void selection(int[] a){
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if( a[j] < a[i]){
                    exch(a,i,j);
                }
            }
        }
    }
    public static void insert(int[] a){
        int n = a.length;
        for(int i =1;i<n;i++){
            for(int j=i; j>=1 && a[j] < a[j-1];j--){
                exch(a,j,j-1);

            }
        }
    }
    public static void sheer(int[] a){
        int n = a.length;
        for(int gap = n/2;gap > 0;gap/=2){
            for(int i = gap;i<n;i++){
                for(int j=i; j>=gap && a[j] < a[j-gap];j=j-gap){
                    exch(a,j,j-gap);

                }
            }
        }

    }
    public static void mergeSortUpDown(int[] a,int start,int end){
        if (start >= end) return;
        int mid = (start+end)/2;
        mergeSortUpDown(a,start,mid);
        mergeSortUpDown(a,mid+1,end);
        merge(a,start,mid,end);
    }
    public static void mergeSortDownUp(int[] a,int start,int end){
        int n = a.length;
        if (start >= end) return;
        for(int size =1;size<n;size *=2){
            for(int i = 0;i < n;i = i + size*2){
                merge(a,i,i+size-1,Math.min(i+size*2-1,n-1));
            }
        }
    }
    public static void quickSort(int[] a,int start,int end){
        if(start >= end) return;
        int j = partition(a,start,end);
        quickSort(a,start,j-1);
        quickSort(a,j+1,end);
    }
    private static int partition(int[] a,int start,int end){
        int i = start;
        int j = end;
        int v = a[start];
        while(i != j){
            while( a[j] >= v && i<j){
                j--;
            }
            while( a[i] <= v && i<j){
                i++;
            }
            if (i<j){
                exch(a,i,j);
            }
        }
        exch(a,start,j);
        return j;
    }
    private static void merge(int[] a,int start,int mid,int end){
        int n = end-start+1;
        int[] tmp = new int[n];
        int i = start;
        int j = mid + 1;
        for(int k=0;k<n;k++){
            if(i > mid){
                tmp[k] = a[j++];
            }else if(j > end){
                tmp[k] = a[i++];
            }else if(a[i] < a[j]){
                tmp[k] = a[i++];
            }else{
                tmp[k] = a[j++];
            }
        }
        for(int k = 0;k<n;k++){
            a[start+k] = tmp[k];
        }
    }

    private static void exch(int[] a,int i,int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    public static void main(String[] args){
        sort test = new sort();
        Scanner in = new Scanner(System.in);
        System.out.println("please input the array size");
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }
        test.sheer(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+",");
        }




    }
}
