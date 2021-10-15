import org.junit.Test;

import java.util.Arrays;

/**
 * @author sANbA111
 * @datetime 2021/7/6 20:52
 */
public class Num0167twoSum {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }

    @Test
    public void test(){
        int[] ints = twoSum(new int[]{-1, 0}, -1);
        System.out.println("ints = " + Arrays.toString(ints));
    }
}
