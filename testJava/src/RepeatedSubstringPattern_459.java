/**
 * Created by Administrator on 2016/11/23 0023.
 * �ж�һ���ַ����ܷ�ͨ����һ�����ַ���copy�õ�
 * ��������Ƚ����أ����õ�����չģʽ���ȵķ�����ģʽ�ֻ����n/2�������ѭ�����n/2����ѭ�����ظ����������n�Σ�����1��.
 * Diffculty:Easy
 */
public class RepeatedSubstringPattern_459 {
    public boolean repeatedSubstringPattern(String str) {
        int len = str.length();
        for(int i=len/2 ; i>=1 ; i--) {
            if(len%i == 0) {
                int m = len/i;
                String subS = str.substring(0,i);
                int j;
                for(j=1;j<m;j++) {
                    if(!subS.equals(str.substring(j*i,i+j*i))) break;
                }
                if(j==m)
                    return true;
            }
        }
        return false;
    }
}
