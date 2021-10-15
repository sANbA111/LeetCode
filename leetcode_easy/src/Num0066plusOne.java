/**
 * @author sANbA111
 * @date 2021/5/2 13:40
 */

public class Num0066plusOne {
    public int[] plusOne(int[] digits) {
        int upper = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if((digits[i]+upper)==10){
                upper=1;
                digits[i]=0;
                if(i==0){
                    int[] result =new int[digits.length+1];
                    result[0] = 1;
                    for (int j = 1; j < result.length; j++) {
                        result[j] = digits[j-1];
                        return result;
                    }
                }
            }else{
                digits[i] += upper;
                return digits;
            }
        }
        return digits;
    }
}
