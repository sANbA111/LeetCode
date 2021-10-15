

/**
 * 约瑟夫问题：
 * 是一个非常著名的趣题，即由n个人坐成一圈，按顺时针由1开始给他们编号。然后由第一个人开始报数，数到m的人出局。
 * 现在需要求的是最后一个出局的人的编号。
 * 给定两个int n和m 。请返回最后一个出局的人的编号。
 *
 * 对于这个问题，大多数人想到的是用环形链表解决；但以前我看到别人有用循环就能解决这个问题，并且看不懂他区区几行代码，这次我要再尝试一下
 * 分析递推公式，就是找到这个问题的本质，个人觉得这个递推超难，如果能分析出这个，相信很少会有类似的问题能难到我了
 *
 */
public class Joseph {

    /**
     * 别人写的循环代码（以前没看懂）
     * @param n 人数
     * @param m 数到m的人出去
     * @return 返回最后一个出局人的编号
     */

    public static int getResult(int n, int m) {
        if (n < 0 || m < 0) {
            return -1;
        }
        int last = 0;
        for(int i = 2; i <= n; ++i){
            last = (last+m)%i;
        }
        return (last+1);
    }


    public static void main(String[] args){
        int res = getResult(7, 3                                                                                                                                                                                                                                                                                                                                                                                                 );
        System.out.println(res);





































    }

}
