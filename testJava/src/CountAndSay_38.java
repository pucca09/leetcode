/**
 * Created by chenqingqing on 2017/3/2.
 */
public class CountAndSay_38 {
    String countAndSayForOneString(String input) {
        char tmp = input.charAt(0);
        int  num = 1;
        StringBuffer newString = new StringBuffer("");
        for(int k=1;k<input.length();k++) {
            if(input.charAt(k)==tmp) {
                num++;
                continue;
            }
            newString.append(Integer.toString(num) + tmp);
            tmp = input.charAt(k);
            num = 1;
        }
        newString.append(Integer.toString(num) + tmp);
        return newString.toString();
    }

    public String countAndSay(int n) {
        String result = "1";
        int i = 1;
        while(i<n) {
            result = countAndSayForOneString(result);
            i++;
        }
        return result;
    }
}
