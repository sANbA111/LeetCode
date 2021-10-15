import org.junit.Test;

public class Num0038countAndSay {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        if (n == 2) return "11";
        StringBuilder result = new StringBuilder();
        if (n > 2) {
            String str = countAndSay(n - 1);
            char[] s = str.toCharArray();
            char[] c = new char[s.length];
            int[] count = new int[s.length];
            c[0] = s[0];
            count[0] = 1;
            int intcount = 0;
            for (int i = 1; i <s.length; i++) {
                if (s[i] == c[intcount]) {
                    count[intcount]++;
                } else {
                    result.append(count[intcount]);
                    result.append(c[intcount]);
                    intcount++;
                    c[intcount] = s[i];
                    count[intcount] = 1;
                }
                if (i == s.length-1) {
                    result.append(count[intcount]);
                    result.append(c[intcount]);
                }
            }
        }
        return result.toString();
    }

    @Test
    public void test1() {
        String s = countAndSay(5);
        System.out.println(s);
    }
}
