/**
 * Created by chenqingqing on 2017/3/1.
 */
public class BestTimetoBuyandSellStock_121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int ans = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] > prices[i-1])
                ans += prices[i]-prices[i-1];
        }
        return ans;
    }
}
