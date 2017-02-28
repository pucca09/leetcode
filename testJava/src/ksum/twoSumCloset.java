/**
 * Created by chenqingqing on 2017/2/28.
 */
package ksum;
public class twoSumCloset {

    public int twoSumClosest(int[] sortedNum, int start, int target)
    {
        int head = start, tail = sortedNum.length - 1;
        int res = Integer.MAX_VALUE;
        int dis = Integer.MAX_VALUE;
        while(head < tail)
        {
            int tmp = sortedNum[head] + sortedNum[tail];
            if(tmp < target)
            {
                if(target - tmp < dis)
                {
                    res = tmp;
                    dis = target - tmp;
                }
                head++;
            }
            else if(tmp > target)
            {
                if(tmp - target < dis)
                {
                    res = tmp;
                    dis = tmp - target;
                }
                tail--;
            }
            else
                return target;
        }
        return res;
    }
}
