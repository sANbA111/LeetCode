import org.junit.Test;

/**
 * @author sANbA111
 * @datetime 2021/7/5 20:30
 */
public class Num0136singleNumber {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }

    @Test
    public void test(){
        int[] a = {4,1,2,1,2};
        System.out.println("singleNumber(a) = " + singleNumber(a));
    }
}
