import org.junit.Test;

/**
 * @author sANbA111
 * @datetime 2021/7/7 18:20
 */
public class Num0168convertToTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder str = new StringBuilder();
        int n = 1;
        while (columnNumber != 0) {
            n = columnNumber % 26;
            if (n == 0){
                n = 26;
            }
            columnNumber = (columnNumber - n) / 26;
            str.append((char) (n + 64));
        }
        return str.reverse().toString();
    }

    @Test
    public void test() {
        System.out.println("convertToTitle(1) = " + convertToTitle(2147483647));
    }
}
