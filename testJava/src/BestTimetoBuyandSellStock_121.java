/**
 * Created by chenqingqing on 2017/3/1.
 */
public class BestTimetoBuyandSellStock_121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int low = prices[0];
        int ans = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] < low) low = prices[i];
            else if(prices[i] - low > ans) ans = prices[i] - low;
        }
        return ans;
    }
}
