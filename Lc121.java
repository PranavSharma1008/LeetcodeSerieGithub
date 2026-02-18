


// Best time to Buy and Sell the Stock



// Youtube vedio Link -



//  Solution Java



class Solution {
    public int maxProfit(int[] prices) {
        
        int buytime = prices[0];
        int maxprofit = 0;
        int n = prices.length;

        for(int i = 1; i < n; i++) {

          
            if(prices[i] < buytime) {
                buytime = prices[i];
            }
            else {
                int currprofit = prices[i] - buytime;
                maxprofit = Math.max(maxprofit, currprofit);
            }
        }

        return maxprofit;
    }
}



