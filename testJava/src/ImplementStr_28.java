/** Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Created by Administrator on 2016/12/19 0019.
 */

//
// 字符匹配
public class ImplementStr_28 {
    public int strStr(String haystack, String needle) {
        char[] a = haystack.toCharArray();
        char[] b = needle.toCharArray();
        int m = a.length;
        int n = b.length;
        if((n > m) || (m == 0 && n != 0)){
            return -1;
        }
        //
        if( (n == 0 && m == 0)|| (n == 0 && m != 0) ){
            return 0;
        }
        for(int i =0 ;i <= m-n;i++){
            int j = 0;
            while(j<n){
                if(a[j+i] == b[j]){
                    j ++;
                }else{
                    break;
                }
            }
            if(j == n){
                return i;
            }


        }
        return -1;


    }
}
