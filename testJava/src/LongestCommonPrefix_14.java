import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        int i = 1;
        while(i < strs.length){
            while(strs[i].indexOf(pre) != 0)
                pre = pre.substring(0,pre.length()-1);
            i++;
        }
        return pre;
    }
    public String longestCommonPrefix2(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        String res = "";
        String v = strs[0];
        for(int i = 0;i<v.length();i++){
            char ch = v.charAt(i);
            int j = 1;
            for(; j<strs.length;j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                    break;
                }
            }
            if(j  == strs.length){
                res += ch;
            }else{
                break;
            }
        }
        return res;

    }
    public static void main(String[] args){
        String[] strs = {"a","b"};
        LongestCommonPrefix_14 result = new LongestCommonPrefix_14();
        String prefix = result.longestCommonPrefix(strs);
    }
}
