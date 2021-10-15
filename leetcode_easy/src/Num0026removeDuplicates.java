/*
    给你一个有序数组 nums ，请你原地删除重复出现的元素，
    使每个元素只出现一次，返回删除后数组的新长度。
    不要使用额外的数组空间，你必须在原地修改输入数组
    并在使用O(1)额外空间的条件下完成。
    说明:
    为什么返回数值是整数，但输出的答案是数组呢?
    请注意，输入数组是以「引用」方式传递的，
    这意味着在函数里修改输入数组对于调用者是可见的。
    你可以想象内部操作如下
    // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
    int len = removeDuplicates(nums);
    // 在函数里修改输入数组对于调用者是可见的。
    // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
    for (int i = 0; i < len; i++) {
        print(nums[i]);
    }
    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*/

import org.junit.Test;

import java.util.Arrays;

public class Num0026removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i]==nums[j]){
                    nums[i] = nums[0]-1;
                    count++;
                    break;
                }
            }
        }
        if(count==0) return nums.length;
        count = nums.length- count;
        Arrays.sort(nums);
        for (int i = 0; i < count; i++) {
            nums[i] = nums[nums.length-count+i];
        }
        return count;
    }

    @Test
    public void test1(){
        int[] nums = {1,1,1,1,2,2,3,3};
        int count = removeDuplicates(nums);
        for (int i = 0; i < count; i++) {
            System.out.println(nums[i]+ " ");
        }
        System.out.println("count:" + count);
    }
}
