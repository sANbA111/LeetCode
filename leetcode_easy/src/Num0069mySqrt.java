import org.junit.Test;

/**
 * @author sANbA111
 * @datetime 2021/5/19 18:52
 */
public class Num0069mySqrt {
    public int mySqrt(int x) {
        if(x>=2147395600)
            return 46340;
        int i=1;
        while(i*i<=x){
            i += 1;
        }
        return i-1;
    }

    @Test
    public void test(){
        int i = mySqrt(2147395600);
        System.out.println("i = " + i);
    }
}
