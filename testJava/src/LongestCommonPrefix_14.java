import java.util.Scanner;

/**
 * Created by Administrator on 2016/12/20 0020.
 */
public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        //����Ϊ�գ����ǰ׺Ϊ��
        if(strs.length == 0){
            return "";
        }
        //����һ���ַ���Ϊ�գ����ǰ׺Ϊ��
        for(String s:strs){
            if (s.equals("")){
                return "";
            }
        }
        if(strs.length == 1){
            return strs[0];
        }
        String s = strs[0];
        String res = "";
        for(int i = 0;i < s.length();i++){
            String prefix = s.substring(0,i+1);
            for(int j = 1;j<strs.length;j++){
                if(strs[j].indexOf(prefix) != 0){
                    return res;
                }
            }
            res += s.charAt(i);
        }
        return s;


    }
    public static void main(String[] args){
        String[] strs = {"a","b"};
        LongestCommonPrefix_14 result = new LongestCommonPrefix_14();
        String prefix = result.longestCommonPrefix(strs);
    }
}
