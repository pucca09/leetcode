package erfen;

/**
 * Created by chenqingqing on 2017/4/15.
 */
public class Sqrt_69 {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        long mid = 0;
        while(start <= end){
            mid = (long)(start + end)/2;
            if(mid * mid == x){
                return (int)mid;
            }else if(mid * mid < x){
                start = (int)(mid + 1);
            }else{
                end = (int)(mid -1);
            }
        }
        return end;
    }
}
