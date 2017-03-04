/**
 * Created by chenqingqing on 2017/3/1.
 */
public class BestTimetoBuyandSellStock_123 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int ans = 0;
        int n = prices.length;

        //正向遍历，opt[i]表示 prices[0...i]内做一次交易的最大收益.
        int opt[] = new int[n];
        opt[0] = 0;
        int low = prices[0];
        int curAns = 0;
        for(int i = 0; i<n; i++){
            if(prices[i] < low) low = prices[i];
            else if(curAns < prices[i] - low) curAns = prices[i] - low;
            opt[i] = curAns;
        }

        //逆向遍历, opt[i]表示 prices[i...n-1]内做一次交易的最大收益.
        int optReverse[] = new int[n];
        optReverse[n - 1] = 0;
        curAns = 0;
        int high = prices[n - 1];
        for(int i=n-1; i>=0; i--){
            if(prices[i] > high) high = prices[i];
            else if(curAns < high - prices[i]) curAns = high - prices[i];
            optReverse[i] = curAns;
        }

        //再进行划分，分别计算两个部分
        for(int i=0; i<n; i++){
            int tmp = opt[i] + optReverse[i];
            if(ans < tmp) ans = tmp;
        }
        return ans;
    }
}
