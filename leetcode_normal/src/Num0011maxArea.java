import org.junit.Test;

/**
 * @author sANbA111
 * @create 2021/10/15 16:44
 */
public class Num0011maxArea {
    public int maxArea(int[] height) {
        int[][] dp = new int[height.length][height.length];
        for (int i = 1; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                dp[j][i] = Math.min(height[i], height[j]) * (i - j);
            }
        }
        int max = 0;
        for (int i = 1; i < height.length; i++) {
            for (int j = 0; j < i; j++) {
                if(dp[i][j] > max) {
                    max = dp[i][j];
                }
            }
        }
        return max;
    }
    @Test
    public void test(){
        int[] a = {4,3,2,1,4};
        int i = maxArea(a);
        System.out.println(i);
    }
}
