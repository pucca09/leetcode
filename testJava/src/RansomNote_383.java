import java.util.*;


/**
 * Created by Administrator on 2016/11/23 0023.
 * Description:Given an arbitrary ransom note string and another string containing letters from all the magazines,
 * write a function that will return true if the ransom note can be constructed from the magazines ;
 * otherwise, it will return false.Each letter in the magazine string can only be used once in your ransom note.
 * 判断一个字符串ransom能否由magzine字符串生成
 * Diffculty:Easy
 */
public class RansomNote_383 {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        //构造magzine数组的hash字典
        for(int i = 0; i < magazine.length(); i++) {
            if(map.containsKey(magazine.charAt(i))) {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            }
            else
                map.put(magazine.charAt(i), 1);
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if(map.get(ch) == 0)
                    map.remove(ch);
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.print("please input the ransom string:");
        Scanner in = new Scanner(System.in);
        String rs = in.nextLine();
        System.out.print("please input the magzine string:");
        String ms = in.nextLine();
        Boolean output = canConstruct(rs,ms);
        System.out.println(output);

    }
}

