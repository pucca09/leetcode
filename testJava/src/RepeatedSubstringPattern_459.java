/**
 * Created by Administrator on 2016/11/23 0023.
 * 判断一个字符串能否通过另一个段字符串copy得到
 * 这个方法比较朴素，采用的是扩展模式长度的方法，模式最长只能是n/2，因此外循环最多n/2，内循环是重复次数，最多n次，最少1次.
 * Diffculty:Easy
 */
public class RepeatedSubstringPattern_459 {
    public boolean repeatedSubstringPattern(String str) {
        int len = str.length();
        for(int i=len/2 ; i>=1 ; i--) {
            if(len%i == 0) {
                int m = len/i;
                String subS = str.substring(0,i);
                int j;
                for(j=1;j<m;j++) {
                    if(!subS.equals(str.substring(j*i,i+j*i))) break;
                }
                if(j==m)
                    return true;
            }
        }
        return false;
    }
}
