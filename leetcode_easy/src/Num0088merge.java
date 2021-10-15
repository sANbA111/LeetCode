import org.junit.Test;

/**
 * @author sANbA111
 * @datetime 2021/6/18 18:36
 */
public class Num0088merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            while (--n>=0){
                nums1[n]=nums2[n];
            }
            return;
        }
        while(m>0 && n>0){
            if(nums1[m-1]>=nums2[n-1]){
                nums1[m+n-1]=nums1[m-1];
                m--;
            }else{
                nums1[m+n-1]=nums2[n-1];
                n--;
            }
        }
        if(m==0){
            for (int i = n-1; i >= 0; i--) {
                nums1[i]=nums2[i];
            }
        }
    }

    @Test
    public void test(){
        int[] nums1 = {2,0};
        int[] nums2 = {1};
        merge(nums1,1,nums2,1);
        for (int i : nums1) {
            System.out.println( i);
        }
    }
}
