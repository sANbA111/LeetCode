import org.junit.Test;

/**
 * @author sANbA111
 * @datetime 2021/5/19 19:43
 */
public class Num0070climbStairs {
    /*public int climbStairs(int n) {
        int m=0;
        switch (n){
            case 1:
                return 1;
            case 0:
                return 0;
            default:
                return climbStairs(n-1) + climbStairs(n-2);
        }
    }*/
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    //算法改进1
    public int climbStairs2(int n){
        int[] dp = new int[3];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 0; i < n-1; i++) {
            dp[2] = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }

    //算法改进2
    public int climbStairs3(int n){
        int[] dp = new int[3];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        while(n>1){
            dp[2] = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = dp[2];
            n--;
        }
        return dp[2];
    }


    @Test
    public void test(){
        int j = climbStairs(45);
        int i = climbStairs3(45);
        System.out.println("j = " + j);
        System.out.println("i = " + i);
    }
}
