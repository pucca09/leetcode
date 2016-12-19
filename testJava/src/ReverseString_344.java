import java.util.*;
import java.lang.*;

/**
 * Created by Administrator on 2016/11/23 0023.
 * 344. Reverse String µßµ¹Êý×é
 * Diffculty:Easy
 */
public class ReverseString_344 {
    public String reverseString(String s) {
        int length = s.length();
        StringBuilder r = new StringBuilder(length);
        for ( int i = length - 1 ; i >= 0 ; i-- )
            r.append(s.charAt(i));
        return r.toString();

    }
    public String reverseString_1(String s){
        char[] a = s.toCharArray();
        int start = 0;
        int end = a.length - 1;
        while(start < end ){
            char temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start ++;
            end --;
        }
        return new String(a);
    }
    public String reverseString_2(String s){
        char[] a = s.toCharArray();
        int n = s.length();
        for(int i = 0;i < n/2;i++){
            char temp = a[i];
            a[i] = a[n-1-i];
            a[n-1-i] = temp;
        }
        return new String(a);
    }
    public static void main(String[] args){
        System.out.print("please input the original String:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        ReverseString_344 test = new ReverseString_344();
        String output = test.reverseString_2(input);
        System.out.println(output);

    }
}
