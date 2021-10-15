import org.junit.Test;

import java.math.BigInteger;

/**
 * @author sANbA111
 * @datetime 2021/7/7 20:51
 */
public class Num0172trailingZeroes {
    public int trailingZeroes(int n) {
        if(n<5) return 0;
        else {
            return n/5 ;
        }
    }

    @Test
    public void test(){
        BigInteger sum = new BigInteger("1");
        int n =30 ;
        for (int i = 1; i <= n ; i++) {
            sum.add(sum.divide(new BigInteger(i+"")));
        }
        System.out.println("sum = " + sum);
        BigInteger sum1 = new BigInteger("10");
        System.out.println(sum.divide(new BigInteger(10 + "")));
    }
}
