import com.sun.org.apache.regexp.internal.RE;

/**
 * @author sANbA111
 * @create 2021/10/15 14:26
 */
public class Num0008myAtoi {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }
        char[] chars = s.toCharArray();
        int lenth = chars.length;
        int index = 0;
        while (index < lenth && chars[index] == ' ') {
            index ++;
        }
        if (index==lenth) {
            return 0;
        }
        int sign = 1;
        char firstChar = chars[index];
        if (firstChar == '+') {
            index++;
        } else if (firstChar == '-') {
            index++;
            sign = -1;
        }

        int res = 0;
        while (index < lenth) {
            char currChar = chars[index];
            if (currChar > '9' || currChar < '0') {
                break;
            }
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && (currChar - '0') > Integer.MAX_VALUE % 10)) {
                return Integer.MAX_VALUE;
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && (currChar - '0') > -(Integer.MIN_VALUE % 10))) {
                return Integer.MIN_VALUE;
            }
            res = res * 10 + sign * (currChar - '0');
            index++;
        }
        return res;
    }
}
