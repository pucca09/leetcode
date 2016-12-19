import java.util.ArrayList;

/** 回文判别，忽略特殊符号，只比较字母和数字
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * For example,"A man, a plan, a canal: Panama" is a palindrome."race a car" is not a palindrome.
 * Created by Administrator on 2016/12/19 0019.
 */
public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        char[] a = s.toCharArray();
        int start = 0;
        int end = a.length-1;
        while(start < end){
            if(isAlphanumeric(a[start]) == false){
                start ++;
            }
            if(isAlphanumeric(a[end]) == false){
                end --;
            }
            if(isAlphanumeric(a[start]) == true &&
                    isAlphanumeric(a[end]) == true &&
                    String.valueOf(a[start]).equalsIgnoreCase(String.valueOf(a[end])) == true){
                start ++;
                end --;

            }else if(isAlphanumeric(a[start]) == true &&
                    isAlphanumeric(a[end]) == true &&
                    String.valueOf(a[start]).equalsIgnoreCase(String.valueOf(a[end])) == false){
                return false;
            }
        }
        return true;



    }
    private boolean isAlphanumeric(char ch){
        if(( ch >='A' && ch <='Z')||(ch >='a' && ch <='z')||(ch >='0' && ch <='9')){
            return true;
        }else{
            return false;
        }
    }
}
