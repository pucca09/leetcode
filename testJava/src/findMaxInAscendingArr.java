/**
 * Created by chenqingqing on 2017/3/2.
 */
public class findMaxInAscendingArr {
    //递增递减或递增数组
    public int turningPoint(int[] A) {
        int m = A.length;
        int begin = 0;
        int end = m - 1;
        int tp = begin + (end - begin)/2;

        // the condition "tp > 0 && tp < m -1" makes sure that tp is not at the beginning or the end
        while (tp > 0 && tp < m -1) {
            if (A[tp] > A[tp + 1] && A[tp] > A[tp -1]) {
                return tp;
            } else if (A[tp] < A[tp+1]) {
                begin = tp + 1;
                tp = begin + (end - begin)/2;
            } else {
                end = tp - 1;
                tp = begin + (end - begin)/2;
            }
        }

        return A[m-1];
    }
}
