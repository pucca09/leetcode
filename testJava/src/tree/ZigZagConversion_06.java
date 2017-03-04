package tree;

/**
 * Created by chenqingqing on 2017/3/2.
 */
public class ZigZagConversion_06 {
    public String convert(String s, int nRows) {
        int len = s.length();
        if (len == 0 || nRows < 2) return s;

        String ret = "";
        int lag = 2*nRows - 2; //循环周期
        for (int i = 0; i < nRows; i++) {
            for (int j = i; j < len; j += lag) {
                ret += s.charAt(j);

                //非首行和末行时还要加一个
                if (i > 0 && i < nRows-1) {
                    int t = j + lag - 2*i;
                    if (t < len) {
                        ret += s.charAt(t);
                    }
                }
            }
        }
        return ret;
    }
}
