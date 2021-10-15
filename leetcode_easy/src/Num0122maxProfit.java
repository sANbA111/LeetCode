/**
 * @author sANbA111
 * @datetime 2021/7/5 19:28
 */
public class Num0122maxProfit {
    public int maxProfit(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            prices[i] = prices[i + 1] - prices[i];
        }
        prices[prices.length - 1] = 0;
        return maxSubArray(prices);
    }

    public int maxSubArray(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            if (num >= 0){
                sum += num;
            }
        }
        return sum;
    }
}
