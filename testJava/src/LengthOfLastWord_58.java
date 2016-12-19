/**
 * Created by Administrator on 2016/12/19 0019.
 */
public class LengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        char[] a = s.toCharArray();
        int count = 0;
        int flag = 0;
        for(int i = a.length-1;i>=0;i--){
            if(a[i] != ' '){
                count += 1;
                flag = 1;
            }else if(a[i] == ' ' && flag == 1){
                return count;
            }
        }
        return count;

    }
}
