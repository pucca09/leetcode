/**
 * Created by chenqingqing on 2017/2/28.
 */
//在一个数组中原地删除等于某个值的所有实例，并返回删除后的数组长度

public class RemoveElement_27 {
    public int removeElement(int[] A, int elem) {
        int m = 0;
        for(int i = 0; i < A.length; i++){

            if(A[i] != elem){
                A[m] = A[i];
                m++;
            }
        }

        return m;
    }
}
