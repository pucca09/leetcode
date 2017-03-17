/**
 * Created by chenqingqing on 2017/3/8.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.*;
public class parseValidIP {

    /** 请完成下面这个函数，实现题目要求的功能 **/

    public static ArrayList<String> parseValidateIp(String s)
    {
        ArrayList<String> res = new ArrayList<String>();
        if (s == null || s.length() < 4 || s.length() > 12) {
            return res;
        }

        StringBuilder temp = new StringBuilder();

        dfs(0, 0, s, temp, res);

        return res;
    }

    public static void dfs(int count, int index, String s, StringBuilder tmp, ArrayList<String> res) {
        if (count == 4 && index == s.length()) {
            res.add(tmp.toString().substring(0, tmp.length() - 1));
            return;
        } else {
            for (int i = 1; i <= 3 && index + i <= s.length(); i++) {
                String tmpStr = s.substring(index, index + i);
                if (isValid(tmpStr)) {
                    int begin = tmp.length();
                    int end = tmp.length() + tmpStr.length();
                    tmp.append(tmpStr).append(".");
                    dfs(count + 1, index + i, s, tmp, res);
                    tmp.delete(begin, end + 1);
                }
            }
        }
    }

    public static boolean isValid(String s) {
        if (s.charAt(0) == '0') {
            return s.equals("0");
        }

        int count = Integer.parseInt(s);
        return count > 0 && count <= 255;
    }



    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<String> temp;

        String _inputStr;
        try {
            _inputStr = in.nextLine();
        } catch (Exception e) {
            _inputStr = null;
        }

        temp = parseValidateIp(_inputStr);
        String[] res = new String[temp.size()];
        temp.toArray(res);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }

    }
}
