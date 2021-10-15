/**
 * @author sANbA111
 * @create 2021/10/15 12:42
 */
public class Num0005longestPalindrome {
    //中心扩散法
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int len = 1;
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int maxStart = 0;
        int strLen = s.length();

        for (int i = 0; i < strLen; i++) {
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                len++;
                left--;
            }
            while (right < strLen && s.charAt(right) == s.charAt(i)) {
                len++;
                right++;
            }
            while (left >= 0 && right < strLen && s.charAt(left) == s.charAt(right)) {
                len += 2;
                left--;
                right++;
            }
            if (len > maxLen) {
                maxLen = len;
                maxStart = left;
            }
            len = 1;
        }
        return s.substring(maxStart + 1, maxStart + maxLen + 1);
    }

    public String longestPalindrome2(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int strLen = s.length();
        int maxStart = 0;
        int maxEnd = 0;
        int maxLen = 1;
        boolean[][] dp = new boolean[strLen][strLen];

        for (int i = 1; i < strLen; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - 1) <= 2 || dp[i+1][j-1]) {
                    dp[i][j] = true;
                    if (j - i + 1 > maxLen) {
                        maxLen = j - i + 1;
                        maxStart = i;
                        maxEnd = j;
                    }
                }
            }
        }
        return s.substring(maxStart,maxEnd + 1);
    }
}
