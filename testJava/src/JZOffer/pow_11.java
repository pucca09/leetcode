package JZOffer;

/**
 * Created by chenqingqing on 2017/4/13.
 */
public class pow_11 {
    public double pow(double x,int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return x;
        }
        if(x == 0){
            return 0;
        }
        double result = 0;
        result = pow(x,n/2);

        if(n %2 == 0){
            return result * result;
        }else{
            return result * result*x;
        }
    }
}
