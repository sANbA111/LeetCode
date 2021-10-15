import org.junit.Test;

/**
 * @author sANbA111
 * @date 2021/5/2 13:28
 */
public class Num0058lengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if("".equals(s))
            return 0;
        else{
            String[] str= s.split(" ");
            if(str.length==0) return 0;
            return str[str.length-1].length();
        }
    }
    @Test
    public void test1(){
        int n = lengthOfLastWord("     ");
        System.out.println("n = " + n);
    }
}
