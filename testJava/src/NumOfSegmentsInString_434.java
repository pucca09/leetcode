/** �ַ����ÿո�ָ�����������ո�����ַ����ĸ���
 * Created by Administrator on 2016/12/19 0019.
 */
public class NumOfSegmentsInString_434 {
    public int countSegments(String s) {
        char[] a = s.toCharArray();
        int count = 0;
        int flag = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] != ' '){
                flag = 1;
            }else if(a[i] == ' ' && flag == 1){
                flag = 0;
                count ++;
            }
        }
        if(flag == 1){
            count++;
        }
        return count;
    }
}
