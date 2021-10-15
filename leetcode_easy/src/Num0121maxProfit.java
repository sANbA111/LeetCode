import org.junit.Test;

import java.util.Arrays;

/**
 * @author sANbA111
 * @datetime 2021/6/24 16:27
 */
public class Num0121maxProfit {
    public int maxProfit(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            prices[i] = prices[i + 1] - prices[i];
        }
        prices[prices.length - 1] = 0;
        int b = maxSubArray(prices);
        return b < 0 ? 0 : b;
    }

    public int maxSubArray(int[] nums) {

        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    @Test
    public void test() {
        int[] a = {7, 1, 5, 3, 6, 4};
        System.out.println("maxProfit(a) = " + maxProfit(a));
    }
}
