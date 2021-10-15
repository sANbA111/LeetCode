import org.junit.Test;

import java.util.ArrayList;

/**
 * @author sANbA111
 * @create 2021/10/15 13:47
 */
public class Num0006convert {
    public String convert(String s, int numRows) {
        if (numRows < 2 ) {
            return s;
        }
        ArrayList<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int i = 0,flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }

        return res.toString();
    }

    @Test
    public void test(){
        String s  = "PAYPALISHIRING";
        String convert = convert(s, 4);
        System.out.println(convert);
    }
}
