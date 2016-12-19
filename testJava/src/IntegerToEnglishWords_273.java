import java.util.Scanner;

/**
 * Created by Administrator on 2016/11/24 0024.
 * Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than 231 - 1.
 * INPUT: 1)123
 *        2)12345
 *        3)1234567
 * OUTPUT: 1)One Hundred Twenty Three
 *         2)Twelve Thousand Three Hundred Forty Five
 *         3)One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven
 * Diffculty:Hard
 *
 */
public class IntegerToEnglishWords_273 {
    private String [] LESS20 = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
            "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private String [] LESS100 = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    private String [] BIG = {"","Thousand","Million","Billion"};

    public String integerToStr(int num){
        //边界条件：num == 0
        if(num == 0){
            return "Zero";
        }
        else if(num < 0){
            return "Error:input must over zero!";
        }
        else{
            int i = 0;
            String result = "";
            while(num > 0){
                if(num%1000 != 0){
                    if (result != ""){
                        result = lessThousand(num%1000) +" "+ BIG[i] +" "+ result;
                    }
                    else{
                        if (i == 0){
                            //num<1000的情况，结尾不能有空格。
                            result = lessThousand(num%1000);

                        }else{
                            //整除的情况
                            result = lessThousand(num%1000)+" "+ BIG[i];

                        }


                    }


                }
                num = num/1000;
                i += 1;


            }
            return result;
        }



    }
    //百位数的表示
    private String lessThousand(int num){
        if (num < 20){
            return LESS20[num];
        }
        else if(num < 100){
            if(num%10 == 0){
                return LESS100[num/10];
            }else{
                return LESS100[num/10]+" "+LESS20[num%10];
            }

        }
        else{
            if(num%100 == 0){
                return LESS20[num/100]+" "+"Hundred";
            }else{
                return LESS20[num/100]+" "+"Hundred"+" "+lessThousand(num%100);
            }
        }
    }
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("please input integer:");
        int input = in.nextInt();
        while(input != -1){
            IntegerToEnglishWords_273 test = new IntegerToEnglishWords_273();
            String output = test.integerToStr(input);
            System.out.println(output);
            System.out.print("please input integer:");
            input = in.nextInt();
        }


    }



}
