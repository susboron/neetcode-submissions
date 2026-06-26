class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices == null || prices.length == 1)
            return 0;

        int profit = 0;
        int maxProfit = 0;

        for(int i = 0; i < prices.length;i ++){
            for(int j = i +1;j < prices.length; j++){
                if (prices[i]<prices[j]){
                    profit = prices[j] - prices[i];
                    if(profit > maxProfit){
                        maxProfit = profit;
                    }
                }
            }
        }

        return maxProfit;
    }
}
