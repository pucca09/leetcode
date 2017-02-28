package ksum;

import java.util.Arrays;

/**
 * Created by chenqingqing on 2017/2/28.
 */
public class threeCloset {
    int threeSumClosest(int[] num, int target) {

        int n = num.length;
        Arrays.sort(num);
        int res = Integer.MAX_VALUE;
            int dis = Integer.MAX_VALUE;
        for(int i = 0; i < n - 2; i++)
        {
            int target2 = target - num[i], tmpdis;
            int tmpres = twoSumClosest(num, i+1, target2);
            if((tmpdis = Math.abs(tmpres - target2)) < dis)
            {
                res = tmpres + num[i];
                dis = tmpdis;
            if(res == target)
                return res;
             }
        }
        return res;
    }

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
