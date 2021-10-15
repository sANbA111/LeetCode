import org.junit.Test;

/**
 * @author sANbA111
 * @datetime 2021/7/5 19:33
 */
public class Num0125isPalindrome {
    public boolean isPalindrome(String s) {
        if("".equals(s)){
            return true;
        }
        s = pre(s);
        StringBuilder str = new StringBuilder(s);
        String s1 = str.reverse().toString();
        return s.equals(s1);
    }

    public String pre(String s){
        s = s.toLowerCase();
        s = s.replace(" ", "");
        char[] chars = s.toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if((chars[i] >='a' && chars[i]<='z') || (chars[i] >='0' && chars[i]<='9')){
                str.append(chars[i]);
            }
        }
        return str.toString();
    }

    @Test
    public void test(){
        String s = "A man, a plan, a canal: Panama";
        boolean b = isPalindrome(s);
        System.out.println("replace = " + b);
    }
}
