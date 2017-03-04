/**
 * Created by Administrator on 2016/12/19 0019.
 */
public class LengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        //bianjie
        if(s.length() == 0){
            return 0;
        }
        int flag = 0;
        char[] ch = s.toCharArray();
        int count = 0;
        for(int i = 0;i<ch.length;i++){
            if(flag == 0 && ch[i] != ' '){
                flag = 1;
                count = 0;
            }
            if(flag == 1 && ch[i] != ' '){
                count++;
            }
            if(ch[i] == ' ') flag = 0;
        }
        return count;
    }
}
