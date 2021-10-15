/*
    实现 strStr() 函数。
    给你两个字符串 haystack 和 needle ，
    请你在 haystack字符串中找出needle字符串出现的第一个位置（下标从 0 开始）。
    如果不存在，则返回  -1 。
    说明：
    当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
    对于本题而言，当 needle 是空字符串时我们应当返回 0 。
    这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/implement-strstr
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
  */

import org.junit.Test;

public class Num0028strStr {
    public int strStr(String haystack, String needle) {
        if("".equals(needle)) return 0;
        else if("".equals(haystack)) return -1;
        else if(needle.length()>haystack.length()) return -1;
        else{
            char[] h = haystack.toCharArray();
            char[] n = needle.toCharArray();
            for (int i = 0; i < h.length; i++) {
                int k = i;
                for (int j = 0; j < n.length; j++) {
                    if(h[k]==n[j]){
                        k++;

                    }else{
                        break;
                    }
                    if(j==n.length-1){
                        return i;
                    }
                    if(k>=h.length)
                        return -1;
                }
            }
        }
        return -1;
    }

    @Test
    public void test1(){
        String haystack = "aabaabba";
        String needle = "bba";
        int c = strStr(haystack,needle);
        System.out.println(c);
    }
}
