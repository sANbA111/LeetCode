import org.junit.Test;
import util.TreeNode;

/**
 * @author sANbA111
 * @datetime 2021/6/24 11:35
 */
public class Num0111minDepth {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return serchMinLeaf(root, 1);
    }

    public int serchMinLeaf(TreeNode t, int dept) {
        if (t.left == null && t.right == null) {
            return dept;
        }

        int temp1=Integer.MAX_VALUE,temp2=Integer.MAX_VALUE;
        if (t.left != null) temp1 = serchMinLeaf(t.left, dept);
        if (t.right != null) temp2 = serchMinLeaf(t.right, dept);
        return Math.min(temp1,temp2)+1;
    }

    @Test
    public void test(){
        TreeNode root = new TreeNode(2,null,new TreeNode(3,null,new TreeNode(4,null,new TreeNode(5,null,null))));
        TreeNode t = new TreeNode(3,new TreeNode(9),new TreeNode(20,new TreeNode(15),new TreeNode(17)));
        int dept = minDepth(t);
        System.out.println("dept = " + dept);
    }
}
