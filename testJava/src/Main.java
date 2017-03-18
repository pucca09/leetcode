/**
 * Created by chenqingqing on 2017/3/18.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s="";
        while(input.hasNextLine()){
            s=input.nextLine();
            System.out.println(s.length()-1-s.lastIndexOf(" "));
        }
    }

}
