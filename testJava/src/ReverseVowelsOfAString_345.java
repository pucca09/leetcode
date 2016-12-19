import java.util.*;

/**
 * Created by Administrator on 2016/11/23 0023.
 * 将字符串中的所有元音位置颠倒
 * 1)识别元音：List 2)颠倒 首尾遍历
 * Diffculty:Easy
 */
public class ReverseVowelsOfAString_345 {
    public static String reverseVowelsOfAString(String s){
        char[] seq = s.toCharArray(); //String to CharArray
        int len = s.length();
        int start = 0;
        int end = len - 1;
        List<Character> charac = new ArrayList<>(Arrays.asList('a', 'e', 'i','o','u',
                'A','E','I','O','U'));//ArrayList 静态初始化
        while (len != 0 && len != 1 && start < end){
            if (charac.contains(seq[start]) == false){
                start += 1;
            }
            if (charac.contains(seq[end]) == false){
                end -= 1;
            }
            if(charac.contains(seq[start]) == true && charac.contains(seq[end]) == true){
                char temp = seq[start];
                seq[start] = seq[end];
                seq[end] = temp;
                start += 1;
                end -= 1;

            }


        }
        return new String(seq); //charArray to String



    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("the test string is:");
        String input = in.nextLine();
        String output = reverseVowelsOfAString(input);
        System.out.println(output);



    }
}
