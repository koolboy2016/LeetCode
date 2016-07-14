public class Solution {
    public int maxProfit(int[] prices) {
        if( prices.length <= 1)
            return  0;
        int length = prices.length;
        int minnumber = prices[0];
        int result = 0 ;
        for(int i = 1 ; i < length; i++){
            
            if(prices[i] - minnumber > result)
                result = prices[i] - minnumber;
            if(prices[i] < minnumber)
                minnumber = prices[i];

        }
        return result;
    }
}