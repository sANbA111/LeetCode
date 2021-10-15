import org.junit.Test;

public class Num0014longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        String s = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int count = 0;
            char[] chars1 = strs[i].toCharArray();
            char[] chars2 = s.toCharArray();
            for (int j = 0; j < chars1.length && j < chars2.length; j++) {
                if(chars1[j]==chars2[j]){
                    count++;
                }else{
                    break;
                }
            }
            if (count==0) return "";
            else {
                s=new String(chars1,0,count);
            }
        }
        return s;
    }
    @Test
    public void test1(){
        String[] strs = {"flower","flow","flight"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }
}
