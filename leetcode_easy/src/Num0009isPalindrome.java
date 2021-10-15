/*
    给你一个整数x,如果x是一个回文整数,返回true;否则,返回 false.
    回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如,121是回文,而123不是。
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/palindrome-number
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/


import org.junit.Test;

public class Num0009isPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int y= x;
        long result = 0;
        while(y!=0){
            long temp = y%10;
            result = result*10 + temp;
            y /= 10;
        }
        if(result-x==0) return true;
        return  false;
    }
    @Test
    public void test1(){
        System.out.println(isPalindrome(121));
    }
}
