/*
    给你一个32位的有符号整数x,返回将x中的数字部分反转后的结果。
    如果反转后整数超过32位的有符号整数的范围[−2^31,2^31−1]就返回 0。
    假设环境不允许存储64位整数（有符号或无符号）。
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/reverse-integer
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/

public class Num0007reverse {
    public static int reverse(int x) {
        int result = 0;
        while(x!=0){
            int temp = x%10;
            if(result>214748364||(result==214748364&&temp>7)){
                return 0;
            }
            if(result<-214748364||(result==-214748364&&temp<-7)){
                return 0;
            }
            result = result*10 + temp;
            x /= 10;
        }
        return result;
    }
}

