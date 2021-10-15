import org.junit.Test;

/**
 * @author sANbA111
 * @datetime 2021/7/7 20:42
 */
public class Num0171titleToNumber {
    public int titleToNumber(String columnTitle) {
        int sum = ((int)(columnTitle.charAt(columnTitle.length()-1)) - 64);
        int n = 26;
        for (int i = columnTitle.length() - 2; i >= 0; i--) {
            sum += ((int)(columnTitle.charAt(i)) - 64) * n;
            n *= 26;
        }
        return sum;
    }

    @Test
    public void test(){
        String str = "ZY";
        System.out.println("titleToNumber(str) = " + titleToNumber(str));
    }
}
