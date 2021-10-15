import org.junit.Test;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author sANbA111
 * @create 2021/10/15 11:20
 */
public class Num0003lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c));
            }
            map.put(c,i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    @Test
    public void test(){
        String s = "dvdf";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
