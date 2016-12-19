import java.util.*;

/** 从n个数中取出k个不重复的数
 * Created by Administrator on 2016/11/23 0023.
 */
public class LotteryDrawing {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("n is :");
        int n = in.nextInt();
        System.out.print("k is :");
        int k = in.nextInt();
        int[] numbers = new int[n];
        int[] results = new int[k];
        for(int i = 0;i < n; i++){
            numbers[i] = i;
        }
        for(int j = 0;j < k;j++){
            int r = (int) Math.random() * n ;
            results[j] = numbers[r];
            numbers[r] = numbers[n-1];
            n--;

        }
        for (int item : results){
            System.out.println(item);
        }


    }
}
