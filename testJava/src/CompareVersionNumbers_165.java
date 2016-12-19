/**�汾�Ƚϣ���ʵ����򵥵��ַ����Ƚ����⣬��ͬ�ͼ�һ���±Ƚϣ���ͬ�ͱȽϵ�ǰ��ͬλ�õĴ�С�������
 * ����ı߽�����ǣ������ַ����ĳ��Ȳ���ȡ�Ҫ���������ַ����ֱ𵽴�߽�����
 * Created by Administrator on 2016/11/29 0029.
 */
public class CompareVersionNumbers_165 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");//ע��ת��
        String[] v2 = version2.split("\\.");
        int i = 0;
        int j = 0;
        while( i < v1.length || j < v2.length ){
            if(i == v1.length){
                if(Integer.parseInt(v2[j]) > 0){
                    return -1;
                }
                j ++;
                continue;
            }
            if(j == v2.length){
                if(Integer.parseInt(v1[i]) > 0){
                    return 1;
                }
                i ++;
                continue;
            }
            if(Integer.parseInt(v1[i]) == Integer.parseInt(v2[j])){
                i++;
                j++;
                continue;
            }
            return (Integer.parseInt(v1[i]) > Integer.parseInt(v2[j]))? 1:-1;
        }
        return 0;

    }
    public static void main(String[] args){
        CompareVersionNumbers_165 test = new CompareVersionNumbers_165();
        int result = test.compareVersion("1","1.0.1");
        System.out.println(result);

    }
}
