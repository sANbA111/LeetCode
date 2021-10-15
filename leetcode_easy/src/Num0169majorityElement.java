import org.junit.Test;

import java.util.Random;

/**
 * @author sANbA111
 * @datetime 2021/7/7 19:02
 */
public class Num0169majorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        int k = partition(nums,0,nums.length - 1);
        while (true) {
            if (n == k){
                return nums[k];
            }
            else if(n < k){
                k = partition(nums,0,k);
            }else {
                k = partition(nums,k+1,nums.length - 1);
            }
        }

    }

    public int partition(int[] A,int p,int q){

        int i= p;

        int temp=0;
        for (int j = p+1; j <= q; j++) {
            if (A[j]<A[p]){
                i++;
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }
        }
        temp=A[i];
        A[i]=A[p];
        A[p]=temp;
        return i;
    }

    @Test
    public void test(){
        int n = 10;
        while (n-->0) {
            System.out.println(Math.ceil(Math.random()*100));
        }
    }
}
