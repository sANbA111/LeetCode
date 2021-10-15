import org.junit.Test;
import util.TreeNode;

/**
 * @author sANbA111
 * @datetime 2021/6/24 14:07
 */

public class Num0112hasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return pathSum(root, 0,targetSum,false);
    }

    public boolean pathSum(TreeNode root, int pathSum,int targetSum,boolean flag) {
        if(!flag){
            if (root.right == null && root.left == null) {
                flag = ((pathSum + root.val) == targetSum);
                return flag;
            }else{
                pathSum += root.val;
                if (root.left != null && !flag) flag = pathSum(root.left, pathSum, targetSum,flag);
                if (root.right != null && !flag) flag = pathSum(root.right, pathSum, targetSum, flag);
                return flag;
            }
        }else {
            return true;
        }
    }
    @Test
    public void test(){
        TreeNode t = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        boolean flag = hasPathSum(t,3);
        System.out.println("flag = " + flag);
    }
}
