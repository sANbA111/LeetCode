import util.TreeNode;

/**
 * @author sANbA111
 * @datetime 2021/6/23 20:00
 */
public class Num0108sortedArrayToBST {
    /*public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode((nums[nums.length - 1]));
        int height = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            root = beTree(nums[i],root);
            height++;
            if(height>=2){
                if(root.right.left==null){
                    root.right.left = root;
                    root = root.right;
                }else{
                    TreeNode temp = root.right.left;
                    temp.left = root;
                    root = root.right;
                    root.right.left = null;
                    temp.right = root;
                    root = temp;
                }
                height--;
            }
        }
        return new TreeNode();
    }
    public TreeNode beTree(int num,TreeNode root){
        return new TreeNode(num,null,root);
    }*/

    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
}
