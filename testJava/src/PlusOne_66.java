/**
 * Created by chenqingqing on 2017/3/1.
 */
public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length-1;i>=0;i--){
            int sum = (digits[i] + carry)%10;
            carry = (digits[i] + carry)/10;
            digits[i] = sum;
            if(carry != 1){
                break;
            }


        }
        if(carry == 1){
            int[] res = new int[digits.length+1];
            System.arraycopy(digits,0,res,1,digits.length);
            res[0] = 1;
            return res;
        }else{
            return digits;
        }

    }
}
