package JZOffer;

/**
 * Created by chenqingqing on 2017/4/13.
 */
public class fibonacci_09 {
    public int Fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if( n==1){
            return 1;
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i =1;i<n;i++){
            sum = a + b;
            a = b;
            b = sum;

        }
        return sum;

    }
}
